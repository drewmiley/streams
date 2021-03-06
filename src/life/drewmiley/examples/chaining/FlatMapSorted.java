package life.drewmiley.examples.chaining;

import life.drewmiley.helper.ComplexObject;
import life.drewmiley.helper.InlineFunctions;
import life.drewmiley.helper.SimpleObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapSorted {

    public SimpleObject[] runStreamForArray(ComplexObject[] complexObjects) {
        return Arrays.stream(complexObjects)
                .flatMap(complexObject -> complexObject.getSimpleObjectList().stream())
                .sorted(InlineFunctions::arbitrarySorter)
                .toArray(SimpleObject[]::new);
    }

    public SimpleObject[] runImperativeForArray(ComplexObject[] complexObjects) {
        SimpleObject[] result = new SimpleObject[0];
        for (int i = 0; i < complexObjects.length; i++) {
            List<SimpleObject> simpleObjectList = complexObjects[i].getSimpleObjectList();
            for (SimpleObject simpleObject : simpleObjectList) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = simpleObject;
            }
        }
        Arrays.sort(result, InlineFunctions::arbitrarySorter);
        return result;
    }

    public List<SimpleObject> runStreamForList(List<ComplexObject> complexObjectList) {
        return complexObjectList.stream()
                .flatMap(complexObject -> complexObject.getSimpleObjectList().stream())
                .sorted(InlineFunctions::arbitrarySorter)
                .collect(Collectors.toList());
    }

    public List<SimpleObject> runImperativeForList(List<ComplexObject> complexObjectList) {
        List<SimpleObject> result = new ArrayList<>();
        for (ComplexObject complexObject : complexObjectList) {
            result.addAll(complexObject.getSimpleObjectList());
        }
        result.sort(InlineFunctions::arbitrarySorter);
        return result;
    }
}
