package life.drewmiley.examples.chaining;

import life.drewmiley.objects.ComplexObject;
import life.drewmiley.objects.SimpleObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedFlatMap {

    private int arbitrarySorter(ComplexObject a, ComplexObject b) {
        return a.getNumber() - b.getNumber();
    }

    public SimpleObject[] runStreamForArray(ComplexObject[] complexObjects) {
        return Arrays.stream(complexObjects)
                .sorted(this::arbitrarySorter)
                .flatMap(complexObject -> complexObject.getSimpleObjectList().stream())
                .toArray(SimpleObject[]::new);
    }

    public SimpleObject[] runImperativeForArray(ComplexObject[] complexObjects) {
        ComplexObject[] inputArray = Arrays.copyOf(complexObjects, complexObjects.length);
        Arrays.sort(inputArray, this::arbitrarySorter);
        SimpleObject[] result = new SimpleObject[0];
        for (int i = 0; i < inputArray.length; i++) {
            List<SimpleObject> simpleObjectList = inputArray[i].getSimpleObjectList();
            for (SimpleObject simpleObject : simpleObjectList) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = simpleObject;
            }
        }
        return result;
    }

    public List<SimpleObject> runStreamForList(List<ComplexObject> complexObjectList) {
        return complexObjectList.stream()
                .sorted(this::arbitrarySorter)
                .flatMap(complexObject -> complexObject.getSimpleObjectList().stream())
                .collect(Collectors.toList());
    }

    public List<SimpleObject> runImperativeForList(List<ComplexObject> complexObjectList) {
        List<ComplexObject> inputList = new ArrayList<>(complexObjectList);
        inputList.sort(this::arbitrarySorter);
        List<SimpleObject> result = new ArrayList<>();
        for (ComplexObject complexObject : inputList) {
            result.addAll(complexObject.getSimpleObjectList());
        }
        return result;
    }
}
