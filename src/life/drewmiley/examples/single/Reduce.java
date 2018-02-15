package life.drewmiley.examples.single;

import life.drewmiley.examples.helper.InlineFunctions;
import life.drewmiley.examples.helper.SimpleObject;

import java.util.Arrays;
import java.util.List;

public class Reduce {

    public SimpleObject runStreamForArray(SimpleObject[] simpleObjects) {
        return Arrays.stream(simpleObjects)
                .reduce(InlineFunctions::arbitraryAccumulator).orElse(null);
    }

    public SimpleObject runImperativeForArray(SimpleObject[] simpleObjects) {
        SimpleObject result = new SimpleObject(0, "");
        for (int i = 0; i < simpleObjects.length; i++) {
            SimpleObject simpleObject = simpleObjects[i];
            result = InlineFunctions.arbitraryAccumulator(result, simpleObject);
        }
        return result;
    }

    public SimpleObject runStreamForList(List<SimpleObject> simpleObjects) {
        return simpleObjects.stream()
                .reduce(InlineFunctions::arbitraryAccumulator).orElse(null);
    }

    public SimpleObject runImperativeForList(List<SimpleObject> simpleObjects) {
        SimpleObject result = new SimpleObject(0, "");
        for (SimpleObject simpleObject : simpleObjects) {
            result = InlineFunctions.arbitraryAccumulator(result, simpleObject);
        }
        return result;
    }
}
