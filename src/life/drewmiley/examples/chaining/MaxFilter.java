package life.drewmiley.examples.chaining;

import life.drewmiley.helper.ComplexObject;
import life.drewmiley.helper.InlineFunctions;
import life.drewmiley.helper.SimpleObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaxFilter {
    public SimpleObject[] runStreamForArray(ComplexObject[] complexObjects) {
        return Arrays.stream(complexObjects)
                .filter(complexObject -> InlineFunctions.arbitraryFilter(complexObject))
                .max(InlineFunctions::arbitrarySorter)
                .get().getSimpleObjectList().stream()
                .filter(simpleObject -> InlineFunctions.arbitraryFilter(simpleObject))
                .toArray(SimpleObject[]::new);
    }

    public SimpleObject[] runImperativeForArray(ComplexObject[] complexObjects) {
        ComplexObject[] array = complexObjects;
        Arrays.sort(array, InlineFunctions::arbitrarySorter);
        List<SimpleObject> simpleObjects = array[array.length - 1].getSimpleObjectList();
        SimpleObject[] result = new SimpleObject[0];
        for (SimpleObject simpleObject : simpleObjects) {
            if (InlineFunctions.arbitraryFilter(simpleObject)) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = simpleObject;
            }
        }
        return result;
    }

    public List<SimpleObject> runStreamForList(List<ComplexObject> complexObjectList) {
        return complexObjectList.stream()
                .filter(complexObject -> InlineFunctions.arbitraryFilter(complexObject))
                .max(InlineFunctions::arbitrarySorter)
                .get().getSimpleObjectList().stream()
                .filter(simpleObject -> InlineFunctions.arbitraryFilter(simpleObject))
                .collect(Collectors.toList());
    }

    public List<SimpleObject> runImperativeForList(List<ComplexObject> complexObjectList) {
        List<ComplexObject> list = complexObjectList;
        list.sort(InlineFunctions::arbitrarySorter);
        List<SimpleObject> simpleObjectList = list.get(list.size() - 1).getSimpleObjectList();
        List<SimpleObject> result = new ArrayList<>();
        for (SimpleObject simpleObject : simpleObjectList) {
            if (InlineFunctions.arbitraryFilter(simpleObject)) {
                result.add(simpleObject);
            }
        }
        return result;
    }
}
