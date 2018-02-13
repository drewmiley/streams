package life.drewmiley.examples.chaining;

import life.drewmiley.objects.SimpleObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedMap {

    private int arbitrarySorter(SimpleObject a, SimpleObject b) {
        return a.getNumber() - b.getNumber();
    }

    private SimpleObject arbitraryObjectMapper(SimpleObject simpleObject) {
        return new SimpleObject(simpleObject.getNumber() + 10, simpleObject.getText().toUpperCase());
    }

    private String arbitraryMapper(SimpleObject simpleObject) {
        return (simpleObject.getNumber() + 10) + simpleObject.getText().toUpperCase();
    }

    public String[] runStreamForArray(SimpleObject[] simpleObjects) {
        return Arrays.stream(simpleObjects)
                .sorted(this::arbitrarySorter)
                .map(simpleObject -> arbitraryMapper(simpleObject))
                .toArray(String[]::new);
    }

    public String[] runImperativeForArray(SimpleObject[] simpleObjects) {
        SimpleObject[] inputArray = Arrays.copyOf(simpleObjects, simpleObjects.length);
        Arrays.sort(inputArray, this::arbitrarySorter);
        String[] result = new String[0];
        for (int i = 0; i < inputArray.length; i++) {
            SimpleObject simpleObject = inputArray[i];
            result = Arrays.copyOf(result, result.length + 1);
            result[result.length - 1] = arbitraryMapper(simpleObject);
        }
        return result;
    }

    public List<String> runStreamForList(List<SimpleObject> simpleObjectList) {
        return simpleObjectList.stream()
                .sorted(this::arbitrarySorter)
                .map(simpleObject -> arbitraryMapper(simpleObject))
                .collect(Collectors.toList());
    }

    public List<String> runImperativeForList(List<SimpleObject> simpleObjectList) {
        List<SimpleObject> inputList = new ArrayList<>(simpleObjectList);
        inputList.sort(this::arbitrarySorter);
        List<String> result = new ArrayList<>();
        for (SimpleObject simpleObject : inputList) {
            result.add(arbitraryMapper(simpleObject));
        }
        return result;
    }
}
