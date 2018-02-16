package life.drewmiley.examples.complexchaining;

import life.drewmiley.examples.helper.InlineFunctions;
import life.drewmiley.examples.helper.SimpleObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortedMapFilterReduce {

    public String runStreamForArray(SimpleObject[] simpleObjects) {
        return Arrays.stream(simpleObjects)
                .sorted(InlineFunctions::arbitrarySorter)
                .map(simpleObject -> InlineFunctions.arbitraryMapper(simpleObject))
                .filter(d -> InlineFunctions.arbitraryStringFilter(d))
                .reduce("", (result, d) -> result + d.substring(0, 3));
    }

    public String runImperativeForArray(SimpleObject[] simpleObjects) {
        SimpleObject[] inputArray = Arrays.copyOf(simpleObjects, simpleObjects.length);
        Arrays.sort(inputArray, InlineFunctions::arbitrarySorter);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < inputArray.length; i++) {
            SimpleObject simpleObject = inputArray[i];
            String value = InlineFunctions.arbitraryMapper(simpleObject);
            if (InlineFunctions.arbitraryStringFilter(value)) {
                result.append(value.substring(0, 3));
            }
        }
        return result.toString();
    }

    public String runStreamForList(List<SimpleObject> simpleObjectList) {
        return simpleObjectList.stream()
                .sorted(InlineFunctions::arbitrarySorter)
                .map(simpleObject -> InlineFunctions.arbitraryMapper(simpleObject))
                .filter(d -> InlineFunctions.arbitraryStringFilter(d))
                .reduce("", (result, d) -> result + d.substring(0, 3));
    }

    public String runImperativeForList(List<SimpleObject> simpleObjectList) {
        List<SimpleObject> inputList = new ArrayList<>(simpleObjectList);
        inputList.sort(InlineFunctions::arbitrarySorter);
        StringBuilder result = new StringBuilder();
        for (SimpleObject simpleObject : inputList) {
            String value = InlineFunctions.arbitraryMapper(simpleObject);
            if (InlineFunctions.arbitraryStringFilter(value)) {
                result.append(value.substring(0, 3));
            }
        }
        return result.toString();
    }
}
