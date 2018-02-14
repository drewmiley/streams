package life.drewmiley.examples;

import life.drewmiley.examples.helper.SimpleObject;

import java.util.Arrays;
import java.util.List;

public class AllMatch {

    private boolean niceFilter(SimpleObject simpleObject) {
        return simpleObject.getText() != null;
    }

    private boolean arbitraryFilter(SimpleObject simpleObject) {
        return simpleObject.getNumber() % 2 == 0;
    }

    public boolean runStreamForArray(SimpleObject[] simpleObjects) {
        return Arrays.stream(simpleObjects)
                .allMatch(simpleObject -> arbitraryFilter(simpleObject));
    }

    public boolean runImperativeForArray(SimpleObject[] simpleObjects) {
        boolean allMatch = true;
        for (int i = 0; i < simpleObjects.length; i++) {
            SimpleObject simpleObject = simpleObjects[i];
            if (!arbitraryFilter(simpleObject)) {
                allMatch = false;
                break;
            }
        }
        return allMatch;
    }

    public boolean runStreamForList(List<SimpleObject> simpleObjectList) {
        return simpleObjectList.stream()
                .allMatch(simpleObject -> arbitraryFilter(simpleObject));
    }

    public boolean runImperativeForList(List<SimpleObject> simpleObjectList) {
        boolean allMatch = true;
        for (SimpleObject simpleObject : simpleObjectList) {
            if (!arbitraryFilter(simpleObject)) {
                allMatch = false;
                break;
            }
        }
        return allMatch;
    }
}
