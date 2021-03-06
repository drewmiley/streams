package life.drewmiley.examples.chaining;

import life.drewmiley.helper.ComplexObject;
import life.drewmiley.helper.InlineFunctions;
import life.drewmiley.helper.SimpleObject;

import java.util.Arrays;
import java.util.List;

public class FlatMapReduce {

    public SimpleObject runStreamForArray(ComplexObject[] complexObjects) {
        return Arrays.stream(complexObjects)
                .flatMap(complexObject -> complexObject.getSimpleObjectList().stream())
                .reduce(InlineFunctions::arbitraryAccumulator)
                .orElse(null);
    }

    public SimpleObject runImperativeForArray(ComplexObject[] complexObjects) {
        SimpleObject result = new SimpleObject(0, "");
        for (int i = 0; i < complexObjects.length; i++) {
            List<SimpleObject> simpleObjectList = complexObjects[i].getSimpleObjectList();
            for (SimpleObject simpleObject : simpleObjectList) {
                result = InlineFunctions.arbitraryAccumulator(result, simpleObject);
            }
        }
        return result;
    }

    public SimpleObject runStreamForList(List<ComplexObject> complexObjects) {
        return complexObjects.stream()
                .flatMap(complexObject -> complexObject.getSimpleObjectList().stream())
                .reduce(InlineFunctions::arbitraryAccumulator)
                .orElse(null);
    }

    public SimpleObject runImperativeForList(List<ComplexObject> complexObjects) {
        SimpleObject result = new SimpleObject(0, "");
        for (ComplexObject complexObject : complexObjects) {
            List<SimpleObject> simpleObjectList = complexObject.getSimpleObjectList();
            for (SimpleObject simpleObject : simpleObjectList) {
                result = InlineFunctions.arbitraryAccumulator(result, simpleObject);
            }
        }
        return result;
    }
}
