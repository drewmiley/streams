package life.drewmiley.examples.single;

import life.drewmiley.examples.helper.SimpleObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

    private boolean arbitraryFilter(SimpleObject simpleObject) {
        return simpleObject.getNumber() % 2 == 0;
    }

    public SimpleObject[] runStreamForArray(SimpleObject[] simpleObjects) {
        return Arrays.stream(simpleObjects)
                .filter(simpleObject -> arbitraryFilter(simpleObject)).toArray(SimpleObject[]::new);
    }

    public SimpleObject[] runImperativeForArray(SimpleObject[] simpleObjects) {
        SimpleObject[] filteredObjects = new SimpleObject[0];
        for (int i = 0; i < simpleObjects.length; i++) {
            SimpleObject simpleObject = simpleObjects[i];
            if (arbitraryFilter(simpleObject)) {
                filteredObjects = Arrays.copyOf(filteredObjects, filteredObjects.length + 1);
                filteredObjects[filteredObjects.length - 1] = simpleObject;
            }
        }
        return filteredObjects;
    }

    public List<SimpleObject> runStreamForList(List<SimpleObject> simpleObjectList) {
        return simpleObjectList.stream()
                .filter(simpleObject -> arbitraryFilter(simpleObject)).collect(Collectors.toList());
    }

    public List<SimpleObject> runImperativeForList(List<SimpleObject> simpleObjectList) {
        List<SimpleObject> filteredObjects = new ArrayList<>();
        for (SimpleObject simpleObject : simpleObjectList) {
            if (arbitraryFilter(simpleObject)) {
                filteredObjects.add(simpleObject);
            }
        }
        return filteredObjects;
    }
}
