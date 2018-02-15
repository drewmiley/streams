package life.drewmiley.examples.single;

import life.drewmiley.examples.helper.InlineFunctions;
import life.drewmiley.examples.helper.SimpleObject;

import java.util.Arrays;
import java.util.List;

public class AnyMatch {

    public boolean runStreamForArray(SimpleObject[] simpleObjects) {
        return Arrays.stream(simpleObjects)
                .anyMatch(simpleObject -> InlineFunctions.arbitraryFilter(simpleObject));
    }

    public boolean runImperativeForArray(SimpleObject[] simpleObjects) {
        boolean anyMatch = false;
        for (int i = 0; i < simpleObjects.length; i++) {
            SimpleObject simpleObject = simpleObjects[i];
            if (InlineFunctions.arbitraryFilter(simpleObject)) {
                anyMatch = true;
                break;
            }
        }
        return anyMatch;
    }

    public boolean runStreamForList(List<SimpleObject> simpleObjectList) {
        return simpleObjectList.stream()
                .anyMatch(simpleObject -> InlineFunctions.arbitraryFilter(simpleObject));
    }

    public boolean runImperativeForList(List<SimpleObject> simpleObjectList) {
        boolean anyMatch = false;
        for (SimpleObject simpleObject : simpleObjectList) {
            if (InlineFunctions.arbitraryFilter(simpleObject)) {
                anyMatch = true;
                break;
            }
        }
        return anyMatch;
    }
}
