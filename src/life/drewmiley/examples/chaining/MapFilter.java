package life.drewmiley.examples.chaining;

import life.drewmiley.examples.helper.InlineFunctions;
import life.drewmiley.examples.helper.SimpleObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapFilter {

    public String[] runStreamForArray(SimpleObject[] simpleObjects) {
        return Arrays.stream(simpleObjects)
                .map(simpleObject -> InlineFunctions.arbitraryMapper(simpleObject))
                .filter(value -> InlineFunctions.arbitraryStringFilter(value))
                .toArray(String[]::new);
    }

    public String[] runImperativeForArray(SimpleObject[] simpleObjects) {
        String[] result = new String[0];
        for (int i = 0; i < simpleObjects.length; i++) {
            String value = InlineFunctions.arbitraryMapper(simpleObjects[i]);
            if (InlineFunctions.arbitraryStringFilter(value)) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = value;
            }
        }
        return result;
    }

    public List<String> runStreamForList(List<SimpleObject> simpleObjectList) {
        return simpleObjectList.stream()
                .map(simpleObject -> InlineFunctions.arbitraryMapper(simpleObject))
                .filter(value -> InlineFunctions.arbitraryStringFilter(value))
                .collect(Collectors.toList());
    }

    public List<String> runImperativeForList(List<SimpleObject> simpleObjectList) {
        List<String> result = new ArrayList<>();
        for (SimpleObject simpleObject : simpleObjectList) {
            String value = InlineFunctions.arbitraryMapper(simpleObject);
            if (InlineFunctions.arbitraryStringFilter(value)) {
                result.add(value);
            }
        }
        return result;
    }
}
