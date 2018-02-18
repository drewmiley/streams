package life.drewmiley.runners.single;

import life.drewmiley.helper.ObjectGenerator;
import life.drewmiley.helper.SimpleObject;

import java.util.List;

public class ForEach {
    public static void runForEach(ObjectGenerator objectGenerator) {
        System.out.println("Running forEach example");
        life.drewmiley.examples.single.ForEach forEach = new life.drewmiley.examples.single.ForEach();

        SimpleObject[] simpleObjects = objectGenerator.generateSimpleObjectArray();
        forEach.runStreamForArray(simpleObjects);
        forEach.runImperativeForArray(simpleObjects);

        List<SimpleObject> simpleObjectList = objectGenerator.generateSimpleObjectList();
        forEach.runStreamForList(simpleObjectList);
        forEach.runImperativeForList(simpleObjectList);
    }
}