package life.drewmiley.examples.chaining;

import life.drewmiley.objects.ComplexObject;
import life.drewmiley.objects.SimpleObject;

import java.util.Arrays;
import java.util.List;

public class FlatMapReduce {

    private SimpleObject arbitraryAccumulator(SimpleObject a, SimpleObject b) {
        return new SimpleObject(a.getNumber() + b.getNumber(), a.getText() + b.getText());
    }

    public SimpleObject runStreamForArray(ComplexObject[] complexObjects) {
        return Arrays.stream(complexObjects)
                .flatMap(complexObject -> complexObject.getSimpleObjectList().stream())
                .reduce(this::arbitraryAccumulator)
                .orElse(null);
    }

    public SimpleObject runImperativeForArray(ComplexObject[] complexObjects) {
        SimpleObject result = new SimpleObject(0, "");
        for (int i = 0; i < complexObjects.length; i++) {
            List<SimpleObject> simpleObjectList = complexObjects[i].getSimpleObjectList();
            for (SimpleObject simpleObject : simpleObjectList) {
                result = arbitraryAccumulator(result, simpleObject);
            }
        }
        return result;
    }

    public SimpleObject runStreamForList(List<ComplexObject> complexObjects) {
        return complexObjects.stream()
                .flatMap(complexObject -> complexObject.getSimpleObjectList().stream())
                .reduce(this::arbitraryAccumulator)
                .orElse(null);
    }

    public SimpleObject runImperativeForList(List<ComplexObject> complexObjects) {
        SimpleObject result = new SimpleObject(0, "");
        for (ComplexObject complexObject : complexObjects) {
            List<SimpleObject> simpleObjectList = complexObject.getSimpleObjectList();
            for (SimpleObject simpleObject : simpleObjectList) {
                result = arbitraryAccumulator(result, simpleObject);
            }
        }
        return result;
    }
}
