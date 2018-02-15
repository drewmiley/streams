package life.drewmiley.examples.single;

import life.drewmiley.examples.helper.InlineFunctions;
import life.drewmiley.examples.helper.SimpleObject;

import java.util.Arrays;
import java.util.List;

public class ForEach {

    public void runStreamForArray(SimpleObject[] simpleObjects) {
        Arrays.stream(simpleObjects).forEach(simpleObject -> InlineFunctions.arbitraryFunction(simpleObject));
    }

    public void runImperativeForArray(SimpleObject[] simpleObjects) {
        for (int i = 0; i < simpleObjects.length; i++) {
            SimpleObject simpleObject = simpleObjects[i];
            InlineFunctions.arbitraryFunction(simpleObject);
        }
    }

    public void runStreamForList(List<SimpleObject> simpleObjectList) {
        simpleObjectList.forEach(simpleObject -> InlineFunctions.arbitraryFunction(simpleObject));
    }

    public void runImperativeForList(List<SimpleObject> simpleObjectList) {
        for (SimpleObject simpleObject : simpleObjectList) {
            InlineFunctions.arbitraryFunction(simpleObject);
        }
    }
}
