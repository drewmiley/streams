package life.drewmiley.examples;

import life.drewmiley.objects.SimpleObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindFirst {

    private boolean evilFilter(SimpleObject simpleObject) {
        return simpleObject.getNumber() > 1000000;
    }

    private boolean arbitraryFilter(SimpleObject simpleObject) {
        return simpleObject.getNumber() % 2 == 0;
    }

    public SimpleObject runStreamForArray(SimpleObject[] simpleObjects) {
        return Arrays.stream(simpleObjects)
                .filter(simpleObject -> arbitraryFilter(simpleObject))
                .findFirst()
                .orElse(null);
    }

    public SimpleObject runImperativeForArray(SimpleObject[] simpleObjects) {
        SimpleObject firstFound = null;
        for (int i = 0; i < simpleObjects.length; i++) {
            SimpleObject simpleObject = simpleObjects[i];
            if (firstFound == null && arbitraryFilter(simpleObject)) {
                firstFound = simpleObject;
                break;
            }
        }
        return firstFound;
    }

    public SimpleObject runStreamForList(List<SimpleObject> simpleObjectList) {
        return simpleObjectList.stream()
                .filter(simpleObject -> arbitraryFilter(simpleObject))
                .findFirst()
                .orElse(null);
    }

    public SimpleObject runImperativeForList(List<SimpleObject> simpleObjectList) {
        SimpleObject firstFound = null;
        for (SimpleObject simpleObject : simpleObjectList) {
            if (firstFound == null && arbitraryFilter(simpleObject)) {
                firstFound = simpleObject;
                break;
            }
        }
        return firstFound;
    }
}
