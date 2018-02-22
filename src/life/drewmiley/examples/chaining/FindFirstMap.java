package life.drewmiley.examples.chaining;

import life.drewmiley.helper.ComplexObject;
import life.drewmiley.helper.InlineFunctions;
import life.drewmiley.helper.SimpleObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindFirstMap {

    public String[] runStreamForArray(ComplexObject[] complexObjects) {
        return Arrays.stream(complexObjects)
                .filter(complexObject -> InlineFunctions.arbitraryFilter(complexObject))
                .findFirst()
                .get().getSimpleObjectList().stream()
                .map(simpleObject -> InlineFunctions.arbitraryMapper(simpleObject))
                .toArray(String[]::new);
    }

    public String[] runImperativeForArray(ComplexObject[] complexObjects) {
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
        String[] mappedObjects = new String[simpleObjects.size()];
        for (int i = 0; i < simpleObjects.size(); i++) {
            SimpleObject simpleObject = simpleObjects.get(i);
            mappedObjects[i] = InlineFunctions.arbitraryMapper(simpleObject);
        }
        return mappedObjects;
    }

    public List<String> runStreamForList(List<ComplexObject> complexObjectList) {
        return complexObjectList.stream()
                .filter(complexObject -> InlineFunctions.arbitraryFilter(complexObject))
                .findFirst()
                .get().getSimpleObjectList().stream()
                .map(simpleObject -> InlineFunctions.arbitraryMapper(simpleObject))
                .collect(Collectors.toList());
    }

    public List<String> runImperativeForList(List<ComplexObject> complexObjectList) {
        List<ComplexObject> list = complexObjectList;
        ComplexObject firstFound = null;
        for (ComplexObject complexObject : list) {
            if (InlineFunctions.arbitraryFilter(complexObject)) {
                firstFound = complexObject;
                break;
            }
        }
        List<SimpleObject> simpleObjectList = firstFound.getSimpleObjectList();
        List<String> mappedObjects = new ArrayList<>();
        for (SimpleObject simpleObject : simpleObjectList) {
            mappedObjects.add(InlineFunctions.arbitraryMapper(simpleObject));
        }
        return mappedObjects;
    }
}
