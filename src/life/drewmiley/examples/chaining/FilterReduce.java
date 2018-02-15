package life.drewmiley.examples.chaining;

import life.drewmiley.examples.helper.InlineFunctions;
import life.drewmiley.examples.helper.SimpleObject;

import java.util.Arrays;
import java.util.List;

public class FilterReduce {

    public SimpleObject runStreamForArray(SimpleObject[] simpleObjects) {
        return Arrays.stream(simpleObjects)
                .filter(simpleObject -> InlineFunctions.arbitraryFilter(simpleObject))
                .reduce(InlineFunctions::arbitraryAccumulator)
                .orElse(null);
    }

    public SimpleObject runImperativeForArray(SimpleObject[] simpleObjects) {
        SimpleObject result = new SimpleObject(0, "");
        for (int i = 0; i < simpleObjects.length; i++) {
            SimpleObject simpleObject = simpleObjects[i];
            if (InlineFunctions.arbitraryFilter(simpleObject)) {
                result = InlineFunctions.arbitraryAccumulator(result, simpleObject);
            }
        }
        return result;
    }

    public SimpleObject runStreamForList(List<SimpleObject> simpleObjectList) {
        return simpleObjectList.stream()
                .filter(simpleObject -> InlineFunctions.arbitraryFilter(simpleObject))
                .reduce(InlineFunctions::arbitraryAccumulator)
                .orElse(null);
    }

    public SimpleObject runImperativeForList(List<SimpleObject> simpleObjects) {
        SimpleObject result = new SimpleObject(0, "");
        for (SimpleObject simpleObject : simpleObjects) {
            if (InlineFunctions.arbitraryFilter(simpleObject)) {
                result = InlineFunctions.arbitraryAccumulator(result, simpleObject);
            }
        }
        return result;
    }
}
