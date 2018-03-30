package life.drewmiley.examples.chaining;

import life.drewmiley.helper.ComplexObject;
import life.drewmiley.helper.InlineFunctions;
import life.drewmiley.helper.SimpleObject;

import java.util.Arrays;
import java.util.List;

public class MaxReduce {
    public SimpleObject runStreamForArray(ComplexObject[] complexObjects) {
        return Arrays.stream(complexObjects)
                .filter(complexObject -> InlineFunctions.arbitraryFilter(complexObject))
                .max(InlineFunctions::arbitrarySorter)
                .get().getSimpleObjectList().stream()
                .reduce(InlineFunctions::arbitraryAccumulator)
                .orElse(null);
    }

    public SimpleObject runImperativeForArray(ComplexObject[] complexObjects) {
        ComplexObject[] array = complexObjects;
        Arrays.sort(array, InlineFunctions::arbitrarySorter);
        List<SimpleObject> simpleObjects = array[array.length - 1].getSimpleObjectList();
        SimpleObject result = new SimpleObject(0, "");
        for (SimpleObject simpleObject : simpleObjects) {
            result = InlineFunctions.arbitraryAccumulator(result, simpleObject);
        }
        return result;
    }

    public SimpleObject runStreamForList(List<ComplexObject> complexObjectList) {
        return complexObjectList.stream()
                .filter(complexObject -> InlineFunctions.arbitraryFilter(complexObject))
                .max(InlineFunctions::arbitrarySorter)
                .get().getSimpleObjectList().stream()
                .reduce(InlineFunctions::arbitraryAccumulator)
                .orElse(null);
    }

    public SimpleObject runImperativeForList(List<ComplexObject> complexObjectList) {
        List<ComplexObject> list = complexObjectList;
        list.sort(InlineFunctions::arbitrarySorter);
        List<SimpleObject> simpleObjectList = list.get(list.size() - 1).getSimpleObjectList();
        SimpleObject result = new SimpleObject(0, "");
        for (SimpleObject simpleObject : simpleObjectList) {
            result = InlineFunctions.arbitraryAccumulator(result, simpleObject);
        }
        return result;
    }
}
