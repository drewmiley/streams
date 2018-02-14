package life.drewmiley.examples;

import life.drewmiley.examples.helper.SimpleObject;

import java.util.Arrays;
import java.util.List;

public class AnyMatch {

    private boolean evilFilter(SimpleObject simpleObject) {
        return simpleObject.getNumber() > 1000000;
    }

    private boolean arbitraryFilter(SimpleObject simpleObject) {
        return simpleObject.getNumber() % 2 == 0;
    }

    public boolean runStreamForArray(SimpleObject[] simpleObjects) {
        return Arrays.stream(simpleObjects)
                .anyMatch(simpleObject -> arbitraryFilter(simpleObject));
    }

    public boolean runImperativeForArray(SimpleObject[] simpleObjects) {
        boolean anyMatch = false;
        for (int i = 0; i < simpleObjects.length; i++) {
            SimpleObject simpleObject = simpleObjects[i];
            if (arbitraryFilter(simpleObject)) {
                anyMatch = true;
                break;
            }
        }
        return anyMatch;
    }

    public boolean runStreamForList(List<SimpleObject> simpleObjectList) {
        return simpleObjectList.stream()
                .anyMatch(simpleObject -> arbitraryFilter(simpleObject));
    }

    public boolean runImperativeForList(List<SimpleObject> simpleObjectList) {
        boolean anyMatch = false;
        for (SimpleObject simpleObject : simpleObjectList) {
            if (arbitraryFilter(simpleObject)) {
                anyMatch = true;
                break;
            }
        }
        return anyMatch;
    }
}
