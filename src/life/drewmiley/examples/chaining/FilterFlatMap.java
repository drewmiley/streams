package life.drewmiley.examples.chaining;

import life.drewmiley.helper.ComplexObject;
import life.drewmiley.helper.InlineFunctions;
import life.drewmiley.helper.SimpleObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterFlatMap {

    public SimpleObject[] runStreamForArray(ComplexObject[] complexObjects) {
        return Arrays.stream(complexObjects)
                .filter(complexObject -> InlineFunctions.arbitraryFilter(complexObject))
                .flatMap(complexObject -> complexObject.getSimpleObjectList().stream())
                .toArray(SimpleObject[]::new);
    }

    public SimpleObject[] runImperativeForArray(ComplexObject[] complexObjects) {
        SimpleObject[] simpleObjects = new SimpleObject[0];
        for (int i = 0; i < complexObjects.length; i++) {
            int currentSimpleObjectsLength = simpleObjects.length;
            ComplexObject complexObject = complexObjects[i];
            if (InlineFunctions.arbitraryFilter(complexObject)) {
                List<SimpleObject> simpleObjectsList = complexObject.getSimpleObjectList();
                simpleObjects = Arrays.copyOf(simpleObjects, currentSimpleObjectsLength + simpleObjectsList.size());
                int index = 0;
                for (SimpleObject simpleObject : simpleObjectsList) {
                    simpleObjects[currentSimpleObjectsLength + index] = simpleObject;
                    index++;
                }
            }
        }
        return simpleObjects;
    }

    public List<SimpleObject> runStreamForList(List<ComplexObject> complexObjectList) {
        return complexObjectList.stream()
                .filter(complexObject -> InlineFunctions.arbitraryFilter(complexObject))
                .flatMap(complexObject -> complexObject.getSimpleObjectList().stream())
                .collect(Collectors.toList());
    }

    public List<SimpleObject> runImperativeForList(List<ComplexObject> complexObjectList) {
        List<SimpleObject> simpleObjectList = new ArrayList<>();
        for (ComplexObject complexObject : complexObjectList) {
            if (InlineFunctions.arbitraryFilter(complexObject)) {
                simpleObjectList.addAll(complexObject.getSimpleObjectList());
            }
        }
        return simpleObjectList;
    }
}
