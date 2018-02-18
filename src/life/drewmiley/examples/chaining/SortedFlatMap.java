package life.drewmiley.examples.chaining;

import life.drewmiley.helper.ComplexObject;
import life.drewmiley.helper.InlineFunctions;
import life.drewmiley.helper.SimpleObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedFlatMap {

    public SimpleObject[] runStreamForArray(ComplexObject[] complexObjects) {
        return Arrays.stream(complexObjects)
                .sorted(InlineFunctions::arbitrarySorter)
                .flatMap(complexObject -> complexObject.getSimpleObjectList().stream())
                .toArray(SimpleObject[]::new);
    }

    public SimpleObject[] runImperativeForArray(ComplexObject[] complexObjects) {
        ComplexObject[] inputArray = Arrays.copyOf(complexObjects, complexObjects.length);
        Arrays.sort(inputArray, InlineFunctions::arbitrarySorter);
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
                .sorted(InlineFunctions::arbitrarySorter)
                .flatMap(complexObject -> complexObject.getSimpleObjectList().stream())
                .collect(Collectors.toList());
    }

    public List<SimpleObject> runImperativeForList(List<ComplexObject> complexObjectList) {
        List<ComplexObject> inputList = new ArrayList<>(complexObjectList);
        inputList.sort(InlineFunctions::arbitrarySorter);
        List<SimpleObject> result = new ArrayList<>();
        for (ComplexObject complexObject : inputList) {
            result.addAll(complexObject.getSimpleObjectList());
        }
        return result;
    }
}
