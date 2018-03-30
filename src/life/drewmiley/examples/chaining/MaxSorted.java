package life.drewmiley.examples.chaining;

import life.drewmiley.helper.ComplexObject;
import life.drewmiley.helper.InlineFunctions;
import life.drewmiley.helper.SimpleObject;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaxSorted {
    public SimpleObject[] runStreamForArray(ComplexObject[] complexObjects) {
        return Arrays.stream(complexObjects)
                .filter(complexObject -> InlineFunctions.arbitraryFilter(complexObject))
                .max(InlineFunctions::arbitrarySorter)
                .get().getSimpleObjectList().stream()
                .sorted(InlineFunctions::arbitrarySorter)
                .toArray(SimpleObject[]::new);
    }

    public SimpleObject[] runImperativeForArray(ComplexObject[] complexObjects) {
        ComplexObject[] array = complexObjects;
        Arrays.sort(array, InlineFunctions::arbitrarySorter);
        List<SimpleObject> simpleObjects = array[array.length - 1].getSimpleObjectList();
        SimpleObject[] result = new SimpleObject[simpleObjects.size()];
        simpleObjects.toArray(result);
        Arrays.sort(result, InlineFunctions::arbitrarySorter);
        return result;
    }

    public List<SimpleObject> runStreamForList(List<ComplexObject> complexObjectList) {
        return complexObjectList.stream()
                .filter(complexObject -> InlineFunctions.arbitraryFilter(complexObject))
                .max(InlineFunctions::arbitrarySorter)
                .get().getSimpleObjectList().stream()
                .sorted(InlineFunctions::arbitrarySorter)
                .collect(Collectors.toList());
    }

    public List<SimpleObject> runImperativeForList(List<ComplexObject> complexObjectList) {
        List<ComplexObject> list = complexObjectList;
        list.sort(InlineFunctions::arbitrarySorter);
        List<SimpleObject> simpleObjectList = list.get(list.size() - 1).getSimpleObjectList();
        List<SimpleObject> result = simpleObjectList;
        result.sort(InlineFunctions::arbitrarySorter);
        return result;
    }
}
