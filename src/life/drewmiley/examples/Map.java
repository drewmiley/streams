package life.drewmiley.examples;

import life.drewmiley.objects.SimpleObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {

    private SimpleObject arbitraryObjectMapper(SimpleObject simpleObject) {
        return new SimpleObject(simpleObject.getNumber() + 10, simpleObject.getText().toUpperCase());
    }

    private String arbitraryMapper(SimpleObject simpleObject) {
        return (simpleObject.getNumber() + 10) + simpleObject.getText().toUpperCase();
    }

    public String[] runStreamForArray(SimpleObject[] simpleObjects) {
        return Arrays.stream(simpleObjects)
                .map(simpleObject -> arbitraryMapper(simpleObject)).toArray(String[]::new);
    }

    public String[] runImperativeForArray(SimpleObject[] simpleObjects) {
        String[] mappedObjects = new String[simpleObjects.length];
        for (int i = 0; i < simpleObjects.length; i++) {
            SimpleObject simpleObject = simpleObjects[i];
            mappedObjects[i] = arbitraryMapper(simpleObject);
        }
        return mappedObjects;
    }

    public List<String> runStreamForList(List<SimpleObject> simpleObjectList) {
        return simpleObjectList.stream()
                .map(simpleObject -> arbitraryMapper(simpleObject)).collect(Collectors.toList());
    }

    public List<String> runImperativeForList(List<SimpleObject> simpleObjectList) {
        List<String> mappedObjects = new ArrayList<>();
        for (SimpleObject simpleObject : simpleObjectList) {
            mappedObjects.add(arbitraryMapper(simpleObject));
        }
        return mappedObjects;
    }
}
