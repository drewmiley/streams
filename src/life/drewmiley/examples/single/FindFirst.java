package life.drewmiley.examples.single;

import life.drewmiley.helper.InlineFunctions;
import life.drewmiley.helper.SimpleObject;

import java.util.Arrays;
import java.util.List;

public class FindFirst {

    public SimpleObject runStreamForArray(SimpleObject[] simpleObjects) {
        return Arrays.stream(simpleObjects)
                .filter(simpleObject -> InlineFunctions.arbitraryFilter(simpleObject))
                .findFirst()
                .orElse(null);
    }

    public SimpleObject runImperativeForArray(SimpleObject[] simpleObjects) {
        SimpleObject firstFound = null;
        for (int i = 0; i < simpleObjects.length; i++) {
            SimpleObject simpleObject = simpleObjects[i];
            if (InlineFunctions.arbitraryFilter(simpleObject)) {
                firstFound = simpleObject;
                break;
            }
        }
        return firstFound;
    }

    public SimpleObject runStreamForList(List<SimpleObject> simpleObjectList) {
        return simpleObjectList.stream()
                .filter(simpleObject -> InlineFunctions.arbitraryFilter(simpleObject))
                .findFirst()
                .orElse(null);
    }

    public SimpleObject runImperativeForList(List<SimpleObject> simpleObjectList) {
        SimpleObject firstFound = null;
        for (SimpleObject simpleObject : simpleObjectList) {
            if (InlineFunctions.arbitraryFilter(simpleObject)) {
                firstFound = simpleObject;
                break;
            }
        }
        return firstFound;
    }
}
