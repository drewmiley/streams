package life.drewmiley.runners.single;

import life.drewmiley.helper.ObjectGenerator;
import life.drewmiley.helper.SimpleObject;

import java.util.List;

public class Map {
    public static void run(ObjectGenerator objectGenerator) {
        System.out.println("Running map example");
        life.drewmiley.examples.single.Map map = new life.drewmiley.examples.single.Map();

        SimpleObject[] simpleObjects = objectGenerator.generateSimpleObjectArray();
        String[] mappedObjectsStream = map.runStreamForArray(simpleObjects);
        String[] mappedObjectsImperative = map.runImperativeForArray(simpleObjects);
        System.out.println(mappedObjectsStream[0]);
        System.out.println(mappedObjectsImperative[0]);

        List<SimpleObject> simpleObjectList = objectGenerator.generateSimpleObjectList();
        List<String> mappedObjectListStream = map.runStreamForList(simpleObjectList);
        List<String> mappedObjectListImperative = map.runImperativeForList(simpleObjectList);
        System.out.println(mappedObjectListStream.get(0));
        System.out.println(mappedObjectListImperative.get(0));
    }

    public static void main(String[] strings) {
        run(new ObjectGenerator());
    }
}