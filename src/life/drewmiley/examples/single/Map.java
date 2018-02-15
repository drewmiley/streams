package life.drewmiley.examples.single;

import life.drewmiley.examples.helper.InlineFunctions;
import life.drewmiley.examples.helper.SimpleObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {

    public String[] runStreamForArray(SimpleObject[] simpleObjects) {
        return Arrays.stream(simpleObjects)
                .map(simpleObject -> InlineFunctions.arbitraryMapper(simpleObject)).toArray(String[]::new);
    }

    public String[] runImperativeForArray(SimpleObject[] simpleObjects) {
        String[] mappedObjects = new String[simpleObjects.length];
        for (int i = 0; i < simpleObjects.length; i++) {
            SimpleObject simpleObject = simpleObjects[i];
            mappedObjects[i] = InlineFunctions.arbitraryMapper(simpleObject);
        }
        return mappedObjects;
    }

    public List<String> runStreamForList(List<SimpleObject> simpleObjectList) {
        return simpleObjectList.stream()
                .map(simpleObject -> InlineFunctions.arbitraryMapper(simpleObject)).collect(Collectors.toList());
    }

    public List<String> runImperativeForList(List<SimpleObject> simpleObjectList) {
        List<String> mappedObjects = new ArrayList<>();
        for (SimpleObject simpleObject : simpleObjectList) {
            mappedObjects.add(InlineFunctions.arbitraryMapper(simpleObject));
        }
        return mappedObjects;
    }
}
