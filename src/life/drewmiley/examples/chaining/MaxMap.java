package life.drewmiley.examples.chaining;

import life.drewmiley.helper.ComplexObject;
import life.drewmiley.helper.InlineFunctions;
import life.drewmiley.helper.SimpleObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaxMap {

    public String[] runStreamForArray(ComplexObject[] complexObjects) {
        return Arrays.stream(complexObjects)
                .max(InlineFunctions::arbitrarySorter)
                .map(complexObject -> complexObject.getSimpleObjectList())
                .get().stream()
                .map(simpleObject -> InlineFunctions.arbitraryMapper(simpleObject))
                .toArray(String[]::new);
    }

    public String[] runImperativeForArray(ComplexObject[] complexObjects) {
        ComplexObject[] array = complexObjects;
        Arrays.sort(array, InlineFunctions::arbitrarySorter);
        List<SimpleObject> simpleObjects = array[array.length - 1].getSimpleObjectList();
        String[] mappedObjects = new String[simpleObjects.size()];
        for (int i = 0; i < simpleObjects.size(); i++) {
            SimpleObject simpleObject = simpleObjects.get(i);
            mappedObjects[i] = InlineFunctions.arbitraryMapper(simpleObject);
        }
        return mappedObjects;
    }

    public List<String> runStreamForList(List<ComplexObject> complexObjectList) {
        return complexObjectList.stream()
                .max(InlineFunctions::arbitrarySorter)
                .map(complexObject -> complexObject.getSimpleObjectList())
                .get().stream()
                .map(simpleObject -> InlineFunctions.arbitraryMapper(simpleObject))
                .collect(Collectors.toList());
    }

    public List<String> runImperativeForList(List<ComplexObject> complexObjectList) {
        List<ComplexObject> list = complexObjectList;
        list.sort(InlineFunctions::arbitrarySorter);
        List<SimpleObject> simpleObjectList = list.get(list.size() - 1).getSimpleObjectList();
        List<String> mappedObjects = new ArrayList<>();
        for (SimpleObject simpleObject : simpleObjectList) {
            mappedObjects.add(InlineFunctions.arbitraryMapper(simpleObject));
        }
        return mappedObjects;
    }
}
