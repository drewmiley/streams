package life.drewmiley.examples;

import life.drewmiley.objects.SimpleObject;

import java.util.Arrays;
import java.util.List;

public class ForEach {

    private void arbitaryFunction(SimpleObject simpleObject) {
//        System.out.println(simpleObject.getNumber() + simpleObject.getText());
    }

    public void runStreamForArray(SimpleObject[] simpleObjects) {
        Arrays.stream(simpleObjects).forEach(simpleObject -> arbitaryFunction(simpleObject));
    }

    public void runImperativeForArray(SimpleObject[] simpleObjects) {
        for (int i = 0; i < simpleObjects.length; i++) {
            SimpleObject simpleObject = simpleObjects[i];
            arbitaryFunction(simpleObject);
        }
    }

    public void runStreamForList(List<SimpleObject> simpleObjectList) {
        simpleObjectList.forEach(simpleObject -> arbitaryFunction(simpleObject));
    }

    public void runImperativeForList(List<SimpleObject> simpleObjectList) {
        for (SimpleObject simpleObject : simpleObjectList) {
            arbitaryFunction(simpleObject);
        }
    }
}
