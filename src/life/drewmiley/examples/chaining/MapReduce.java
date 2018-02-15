package life.drewmiley.examples.chaining;

import life.drewmiley.examples.helper.InlineFunctions;
import life.drewmiley.examples.helper.SimpleObject;

import java.util.Arrays;
import java.util.List;

public class MapReduce {

    public String runStreamForArray(SimpleObject[] simpleObjects) {
        return Arrays.stream(simpleObjects)
                .map(simpleObject -> InlineFunctions.arbitraryMapper(simpleObject))
                .reduce((a, b) -> a + b)
                .orElse(null);
    }

    public String runImperativeForArray(SimpleObject[] simpleObjects) {
        String result = "";
        for (int i = 0; i < simpleObjects.length; i++) {
            result += InlineFunctions.arbitraryMapper(simpleObjects[i]);
        }
        return result;
    }

    public String runStreamForList(List<SimpleObject> simpleObjectList) {
        return simpleObjectList.stream()
                .map(simpleObject -> InlineFunctions.arbitraryMapper(simpleObject))
                .reduce((a, b) -> a + b)
                .orElse(null);
    }

    public String runStreamForImperative(List<SimpleObject> simpleObjectList) {
        String result = "";
        for (SimpleObject simpleObject : simpleObjectList) {
            result += InlineFunctions.arbitraryMapper(simpleObject);
        }
        return result;
    }
}
