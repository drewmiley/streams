package life.drewmiley.examples.chaining;

import life.drewmiley.objects.SimpleObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MapSorted {

    private SimpleObject arbitraryObjectMapper(SimpleObject simpleObject) {
        return new SimpleObject(simpleObject.getNumber() + 10, simpleObject.getText().toUpperCase());
    }

    private int arbitraryObjectSorter(SimpleObject a, SimpleObject b) {
        return a.getNumber() - b.getNumber();
    }

    private String arbitraryMapper(SimpleObject simpleObject) {
        return (simpleObject.getNumber() + 10) + simpleObject.getText().toUpperCase();
    }

    private int arbitrarySorter(String a, String b) {
        return a.substring(1, 3).compareTo(b.substring(1, 3));
    }

    public String[] runStreamForArray(SimpleObject[] simpleObjects) {
        return Arrays.stream(simpleObjects)
                .map(simpleObject -> arbitraryMapper(simpleObject))
                .sorted(Comparator.comparing(a -> a.substring(0, 2)))
                .toArray(String[]::new);
    }

    public String[] runImperativeForArray(SimpleObject[] simpleObjects) {
        String[] result = new String[simpleObjects.length];
        for (int i = 0; i < simpleObjects.length; i++) {
            SimpleObject simpleObject = simpleObjects[i];
            result[i] = arbitraryMapper(simpleObject);
        }
        Arrays.sort(result, this::arbitrarySorter);
        return result;
    }

    public List<String> runStreamForList(List<SimpleObject> simpleObjectList) {
        return simpleObjectList.stream()
                .map(simpleObject -> arbitraryMapper(simpleObject))
                .sorted(this::arbitrarySorter)
                .collect(Collectors.toList());
    }

    public List<String> runImperativeForList(List<SimpleObject> simpleObjectList) {
        List<String> result = new ArrayList<>();
        for (SimpleObject simpleObject : simpleObjectList) {
            result.add(arbitraryMapper(simpleObject));
        }
        result.sort(this::arbitrarySorter);
        return result;
    }
}
