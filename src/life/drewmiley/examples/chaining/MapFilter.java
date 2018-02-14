package life.drewmiley.examples.chaining;

import life.drewmiley.examples.helper.SimpleObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapFilter {

    private SimpleObject arbitraryObjectMapper(SimpleObject simpleObject) {
        return new SimpleObject(simpleObject.getNumber() + 10, simpleObject.getText().toUpperCase());
    }

    private boolean arbitraryObjectFilter(SimpleObject simpleObject) {
        return simpleObject.getNumber() % 2 == 0;
    }

    private String arbitraryMapper(SimpleObject simpleObject) {
        return (simpleObject.getNumber() + 10) + simpleObject.getText().toUpperCase();
    }

    private boolean arbitraryFilter(String value) {
        return value.length() >= 8;
    }

    public String[] runStreamForArray(SimpleObject[] simpleObjects) {
        return Arrays.stream(simpleObjects)
                .map(simpleObject -> arbitraryMapper(simpleObject))
                .filter(value -> arbitraryFilter(value))
                .toArray(String[]::new);
    }

    public String[] runImperativeForArray(SimpleObject[] simpleObjects) {
        String[] result = new String[0];
        for (int i = 0; i < simpleObjects.length; i++) {
            String value = arbitraryMapper(simpleObjects[i]);
            if (arbitraryFilter(value)) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = value;
            }
        }
        return result;
    }

    public List<String> runStreamForList(List<SimpleObject> simpleObjectList) {
        return simpleObjectList.stream()
                .map(simpleObject -> arbitraryMapper(simpleObject))
                .filter(value -> arbitraryFilter(value))
                .collect(Collectors.toList());
    }

    public List<String> runImperativeForList(List<SimpleObject> simpleObjectList) {
        List<String> result = new ArrayList<>();
        for (SimpleObject simpleObject : simpleObjectList) {
            String value = arbitraryMapper(simpleObject);
            if (arbitraryFilter(value)) {
                result.add(value);
            }
        }
        return result;
    }
}
