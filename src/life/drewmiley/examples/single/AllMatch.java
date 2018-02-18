package life.drewmiley.examples.single;

import life.drewmiley.helper.InlineFunctions;
import life.drewmiley.helper.SimpleObject;

import java.util.Arrays;
import java.util.List;

public class AllMatch {

    public boolean runStreamForArray(SimpleObject[] simpleObjects) {
        return Arrays.stream(simpleObjects)
                .allMatch(simpleObject -> InlineFunctions.arbitraryFilter(simpleObject));
    }

    public boolean runImperativeForArray(SimpleObject[] simpleObjects) {
        boolean allMatch = true;
        for (int i = 0; i < simpleObjects.length; i++) {
            SimpleObject simpleObject = simpleObjects[i];
            if (!InlineFunctions.arbitraryFilter(simpleObject)) {
                allMatch = false;
                break;
            }
        }
        return allMatch;
    }

    public boolean runStreamForList(List<SimpleObject> simpleObjectList) {
        return simpleObjectList.stream()
                .allMatch(simpleObject -> InlineFunctions.arbitraryFilter(simpleObject));
    }

    public boolean runImperativeForList(List<SimpleObject> simpleObjectList) {
        boolean allMatch = true;
        for (SimpleObject simpleObject : simpleObjectList) {
            if (!InlineFunctions.arbitraryFilter(simpleObject)) {
                allMatch = false;
                break;
            }
        }
        return allMatch;
    }
}
