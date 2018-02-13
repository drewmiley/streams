package life.drewmiley.examples.chaining;

import life.drewmiley.objects.SimpleObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortedReduce {

    private int arbitrarySorter(SimpleObject a, SimpleObject b) {
        return a.getNumber() - b.getNumber();
    }

    private SimpleObject arbitraryAccumulator(SimpleObject a, SimpleObject b) {
        return new SimpleObject(a.getNumber() + b.getNumber(), a.getText() + b.getText());
    }

    public SimpleObject runStreamForArray(SimpleObject[] simpleObjects) {
        return Arrays.stream(simpleObjects)
                .sorted(this::arbitrarySorter)
                .reduce(this::arbitraryAccumulator)
                .orElse(null);
    }

    public SimpleObject runImperativeForArray(SimpleObject[] simpleObjects) {
        SimpleObject[] inputArray = Arrays.copyOf(simpleObjects, simpleObjects.length);
        Arrays.sort(inputArray, this::arbitrarySorter);
        SimpleObject result = new SimpleObject(0, "");
        for (int i = 0; i < inputArray.length; i++) {
            SimpleObject simpleObject = inputArray[i];
            result = arbitraryAccumulator(result, simpleObject);
        }
        return result;
    }

    public SimpleObject runStreamForList(List<SimpleObject> simpleObjectList) {
        return simpleObjectList.stream()
                .sorted(this::arbitrarySorter)
                .reduce(this::arbitraryAccumulator)
                .orElse(null);
    }

    public SimpleObject runImperativeForList(List<SimpleObject> simpleObjects) {
        List<SimpleObject> inputList = new ArrayList<>(simpleObjects);
        inputList.sort(this::arbitrarySorter);
        SimpleObject result = new SimpleObject(0, "");
        for (SimpleObject simpleObject : inputList) {
            result = arbitraryAccumulator(result, simpleObject);
        }
        return result;
    }
}
