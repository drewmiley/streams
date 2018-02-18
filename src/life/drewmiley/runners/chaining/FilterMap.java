package life.drewmiley.runners.chaining;

import life.drewmiley.helper.ObjectGenerator;
import life.drewmiley.helper.SimpleObject;

import java.util.List;

public class FilterMap {
    public static void run(ObjectGenerator objectGenerator) {
        System.out.println("    -Filter, Map");
        life.drewmiley.examples.chaining.FilterMap filterMap = new life.drewmiley.examples.chaining.FilterMap();

        SimpleObject[] simpleObjects = objectGenerator.generateSimpleObjectArray();
        String[] objectsStream = filterMap.runStreamForArray(simpleObjects);
        String[] objectsImperative = filterMap.runImperativeForArray(simpleObjects);
        System.out.println(objectsStream[0]);
        System.out.println(objectsStream.length);
        System.out.println(objectsImperative[0]);
        System.out.println(objectsImperative.length);

        List<SimpleObject> simpleObjectList = objectGenerator.generateSimpleObjectList();
        List<String> objectListStream = filterMap.runStreamForList(simpleObjectList);
        List<String> objectListImperative = filterMap.runImperativeForList(simpleObjectList);
        System.out.println(objectListStream.get(0));
        System.out.println(objectListStream.size());
        System.out.println(objectListImperative.get(0));
        System.out.println(objectListImperative.size());
    }
}