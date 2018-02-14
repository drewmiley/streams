package life.drewmiley.examples.single;

import life.drewmiley.examples.helper.SimpleObject;

import java.util.Arrays;
import java.util.List;

public class Reduce {

    private SimpleObject arbitraryAccumulator(SimpleObject a, SimpleObject b) {
        return new SimpleObject(a.getNumber() + b.getNumber(), a.getText() + b.getText());
    }

    public SimpleObject runStreamForArray(SimpleObject[] simpleObjects) {
        return Arrays.stream(simpleObjects).reduce(this::arbitraryAccumulator).orElse(null);
    }

    public SimpleObject runImperativeForArray(SimpleObject[] simpleObjects) {
        SimpleObject result = new SimpleObject(0, "");
        for (int i = 0; i < simpleObjects.length; i++) {
            SimpleObject simpleObject = simpleObjects[i];
            result = arbitraryAccumulator(result, simpleObject);
        }
        return result;
    }

    public SimpleObject runStreamForList(List<SimpleObject> simpleObjects) {
        return simpleObjects.stream()
                .reduce(this::arbitraryAccumulator).orElse(null);
    }

    public SimpleObject runImperativeForList(List<SimpleObject> simpleObjects) {
        SimpleObject result = new SimpleObject(0, "");
        for (SimpleObject simpleObject : simpleObjects) {
            result = arbitraryAccumulator(result, simpleObject);
        }
        return result;
    }
}
