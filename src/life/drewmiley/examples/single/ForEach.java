package life.drewmiley.examples.single;

import life.drewmiley.helper.InlineFunctions;
import life.drewmiley.helper.SimpleObject;

import java.util.Arrays;
import java.util.List;

public class ForEach {

    public SimpleObject[] runStreamForArray(SimpleObject[] simpleObjects) {
        Arrays.stream(simpleObjects).forEach(simpleObject -> InlineFunctions.arbitraryFunction(simpleObject));
        return simpleObjects;
    }

    public SimpleObject[] runImperativeForArray(SimpleObject[] simpleObjects) {
        for (int i = 0; i < simpleObjects.length; i++) {
            SimpleObject simpleObject = simpleObjects[i];
            InlineFunctions.arbitraryFunction(simpleObject);
        }
        return simpleObjects;
    }

    public List<SimpleObject> runStreamForList(List<SimpleObject> simpleObjectList) {
        simpleObjectList.forEach(simpleObject -> InlineFunctions.arbitraryFunction(simpleObject));
        return simpleObjectList;
    }

    public List<SimpleObject> runImperativeForList(List<SimpleObject> simpleObjectList) {
        for (SimpleObject simpleObject : simpleObjectList) {
            InlineFunctions.arbitraryFunction(simpleObject);
        }
        return simpleObjectList;
    }
}
