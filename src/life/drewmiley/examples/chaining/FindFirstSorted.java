package life.drewmiley.examples.chaining;

import life.drewmiley.helper.ComplexObject;
import life.drewmiley.helper.InlineFunctions;
import life.drewmiley.helper.SimpleObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindFirstSorted {
    public SimpleObject[] runStreamForArray(ComplexObject[] complexObjects) {
        return Arrays.stream(complexObjects)
                .filter(complexObject -> InlineFunctions.arbitraryFilter(complexObject))
                .findFirst()
                .get().getSimpleObjectList().stream()
                .sorted(InlineFunctions::arbitrarySorter)
                .toArray(SimpleObject[]::new);
    }

    public SimpleObject[] runImperativeForArray(ComplexObject[] complexObjects) {
        ComplexObject[] array = complexObjects;
        ComplexObject firstFound = null;
        for (int i = 0; i < array.length; i++) {
            ComplexObject complexObject = array[i];
            if (InlineFunctions.arbitraryFilter(complexObject)) {
                firstFound = complexObject;
                break;
            }
        }
        List<SimpleObject> simpleObjects = firstFound.getSimpleObjectList();
        SimpleObject[] result = new SimpleObject[simpleObjects.size()];
        simpleObjects.toArray(result);
        Arrays.sort(result, InlineFunctions::arbitrarySorter);
        return result;
    }

    public List<SimpleObject> runStreamForList(List<ComplexObject> complexObjectList) {
        return complexObjectList.stream()
                .filter(complexObject -> InlineFunctions.arbitraryFilter(complexObject))
                .findFirst()
                .get().getSimpleObjectList().stream()
                .sorted(InlineFunctions::arbitrarySorter)
                .collect(Collectors.toList());
    }

    public List<SimpleObject> runImperativeForList(List<ComplexObject> complexObjectList) {
        List<ComplexObject> list = complexObjectList;
        ComplexObject firstFound = null;
        for (ComplexObject complexObject : list) {
            if (InlineFunctions.arbitraryFilter(complexObject)) {
                firstFound = complexObject;
                break;
            }
        }
        List<SimpleObject> simpleObjectList = firstFound.getSimpleObjectList();
        List<SimpleObject> result = simpleObjectList;
        result.sort(InlineFunctions::arbitrarySorter);
        return result;
    }
}
