package life.drewmiley.examples;

import life.drewmiley.examples.helper.ComplexObject;
import life.drewmiley.examples.helper.SimpleObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public SimpleObject[] runStreamForArray(ComplexObject[] complexObjects) {
        return Arrays.stream(complexObjects).flatMap(complexObject -> {
            List<SimpleObject> simpleObjectsList = complexObject.getSimpleObjectList();
            simpleObjectsList.add(0, complexObject.getSimpleObject());
            return simpleObjectsList.stream();
        }).toArray(SimpleObject[]::new);
    }

    public SimpleObject[] runImperativeForArray(ComplexObject[] complexObjects) {
        SimpleObject[] simpleObjects = new SimpleObject[0];
        for (int i = 0; i < complexObjects.length; i++) {
            int currentSimpleObjectsLength = simpleObjects.length;
            ComplexObject complexObject = complexObjects[i];
            List<SimpleObject> simpleObjectsList = complexObject.getSimpleObjectList();
            simpleObjectsList.add(0, complexObject.getSimpleObject());
            simpleObjects = Arrays.copyOf(simpleObjects, currentSimpleObjectsLength + simpleObjectsList.size());
            int index = 0;
            for (SimpleObject simpleObject : simpleObjectsList) {
                simpleObjects[currentSimpleObjectsLength + index] = simpleObject;
                index++;
            }
        }
        return simpleObjects;
    }

    public List<SimpleObject> runStreamForList(List<ComplexObject> complexObjectList) {
        return complexObjectList.stream().flatMap(complexObject -> {
            List<SimpleObject> simpleObjectsList = complexObject.getSimpleObjectList();
            simpleObjectsList.add(0, complexObject.getSimpleObject());
            return simpleObjectsList.stream();
        }).collect(Collectors.toList());
    }

    public List<SimpleObject> runImperativeForList(List<ComplexObject> complexObjectList) {
        List<SimpleObject> simpleObjectList = new ArrayList<>();
        for (ComplexObject complexObject : complexObjectList) {
            simpleObjectList.add(complexObject.getSimpleObject());
            simpleObjectList.addAll(complexObject.getSimpleObjectList());
        }
        return simpleObjectList;
    }
}
