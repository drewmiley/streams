package life.drewmiley.examples.chaining;

import life.drewmiley.examples.helper.InlineFunctions;
import life.drewmiley.examples.helper.SimpleObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortedReduce {

    public SimpleObject runStreamForArray(SimpleObject[] simpleObjects) {
        return Arrays.stream(simpleObjects)
                .sorted(InlineFunctions::arbitrarySorter)
                .reduce(InlineFunctions::arbitraryAccumulator)
                .orElse(null);
    }

    public SimpleObject runImperativeForArray(SimpleObject[] simpleObjects) {
        SimpleObject[] inputArray = Arrays.copyOf(simpleObjects, simpleObjects.length);
        Arrays.sort(inputArray, InlineFunctions::arbitrarySorter);
        SimpleObject result = new SimpleObject(0, "");
        for (int i = 0; i < inputArray.length; i++) {
            SimpleObject simpleObject = inputArray[i];
            result = InlineFunctions.arbitraryAccumulator(result, simpleObject);
        }
        return result;
    }

    public SimpleObject runStreamForList(List<SimpleObject> simpleObjectList) {
        return simpleObjectList.stream()
                .sorted(InlineFunctions::arbitrarySorter)
                .reduce(InlineFunctions::arbitraryAccumulator)
                .orElse(null);
    }

    public SimpleObject runImperativeForList(List<SimpleObject> simpleObjects) {
        List<SimpleObject> inputList = new ArrayList<>(simpleObjects);
        inputList.sort(InlineFunctions::arbitrarySorter);
        SimpleObject result = new SimpleObject(0, "");
        for (SimpleObject simpleObject : inputList) {
            result = InlineFunctions.arbitraryAccumulator(result, simpleObject);
        }
        return result;
    }
}
