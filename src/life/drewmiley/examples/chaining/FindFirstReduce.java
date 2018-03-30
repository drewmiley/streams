package life.drewmiley.examples.chaining;

import life.drewmiley.helper.ComplexObject;
import life.drewmiley.helper.InlineFunctions;
import life.drewmiley.helper.SimpleObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindFirstReduce {
    public SimpleObject runStreamForArray(ComplexObject[] complexObjects) {
        return Arrays.stream(complexObjects)
                .filter(complexObject -> InlineFunctions.arbitraryFilter(complexObject))
                .findFirst()
                .get().getSimpleObjectList().stream()
                .reduce(InlineFunctions::arbitraryAccumulator)
                .orElse(null);
    }

    public SimpleObject runImperativeForArray(ComplexObject[] complexObjects) {
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
        SimpleObject result = new SimpleObject(0, "");
        for (SimpleObject simpleObject : simpleObjects) {
            result = InlineFunctions.arbitraryAccumulator(result, simpleObject);
        }
        return result;
    }

    public SimpleObject runStreamForList(List<ComplexObject> complexObjectList) {
        return complexObjectList.stream()
                .filter(complexObject -> InlineFunctions.arbitraryFilter(complexObject))
                .findFirst()
                .get().getSimpleObjectList().stream()
                .reduce(InlineFunctions::arbitraryAccumulator)
                .orElse(null);
    }

    public SimpleObject runImperativeForList(List<ComplexObject> complexObjectList) {
        List<ComplexObject> list = complexObjectList;
        ComplexObject firstFound = null;
        for (ComplexObject complexObject : list) {
            if (InlineFunctions.arbitraryFilter(complexObject)) {
                firstFound = complexObject;
                break;
            }
        }
        List<SimpleObject> simpleObjects = firstFound.getSimpleObjectList();
        SimpleObject result = new SimpleObject(0, "");
        for (SimpleObject simpleObject : simpleObjects) {
            result = InlineFunctions.arbitraryAccumulator(result, simpleObject);
        }
        return result;
    }
}
