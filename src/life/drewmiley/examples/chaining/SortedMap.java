package life.drewmiley.examples.chaining;

import life.drewmiley.examples.helper.InlineFunctions;
import life.drewmiley.examples.helper.SimpleObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedMap {

    public String[] runStreamForArray(SimpleObject[] simpleObjects) {
        return Arrays.stream(simpleObjects)
                .sorted(InlineFunctions::arbitrarySorter)
                .map(simpleObject -> InlineFunctions.arbitraryMapper(simpleObject))
                .toArray(String[]::new);
    }

    public String[] runImperativeForArray(SimpleObject[] simpleObjects) {
        SimpleObject[] inputArray = Arrays.copyOf(simpleObjects, simpleObjects.length);
        Arrays.sort(inputArray, InlineFunctions::arbitrarySorter);
        String[] result = new String[0];
        for (int i = 0; i < inputArray.length; i++) {
            SimpleObject simpleObject = inputArray[i];
            result = Arrays.copyOf(result, result.length + 1);
            result[result.length - 1] = InlineFunctions.arbitraryMapper(simpleObject);
        }
        return result;
    }

    public List<String> runStreamForList(List<SimpleObject> simpleObjectList) {
        return simpleObjectList.stream()
                .sorted(InlineFunctions::arbitrarySorter)
                .map(simpleObject -> InlineFunctions.arbitraryMapper(simpleObject))
                .collect(Collectors.toList());
    }

    public List<String> runImperativeForList(List<SimpleObject> simpleObjectList) {
        List<SimpleObject> inputList = new ArrayList<>(simpleObjectList);
        inputList.sort(InlineFunctions::arbitrarySorter);
        List<String> result = new ArrayList<>();
        for (SimpleObject simpleObject : inputList) {
            result.add(InlineFunctions.arbitraryMapper(simpleObject));
        }
        return result;
    }
}
