package life.drewmiley.runners.chaining;

import life.drewmiley.helper.ObjectGenerator;
import life.drewmiley.helper.SimpleObject;

import java.util.List;

public class MapFilter {
    public static void run(ObjectGenerator objectGenerator) {
        System.out.println("    -Map, Filter");
        life.drewmiley.examples.chaining.MapFilter mapFilter = new life.drewmiley.examples.chaining.MapFilter();

        SimpleObject[] simpleObjects = objectGenerator.generateSimpleObjectArray();
        String[] objectsStream = mapFilter.runStreamForArray(simpleObjects);
        String[] objectsImperative = mapFilter.runImperativeForArray(simpleObjects);
        System.out.println(objectsStream[0]);
        System.out.println(objectsStream.length);
        System.out.println(objectsImperative[0]);
        System.out.println(objectsImperative.length);

        List<SimpleObject> simpleObjectList = objectGenerator.generateSimpleObjectList();
        List<String> objectListStream = mapFilter.runStreamForList(simpleObjectList);
        List<String> objectListImperative = mapFilter.runImperativeForList(simpleObjectList);
        System.out.println(objectListStream.get(0));
        System.out.println(objectListStream.size());
        System.out.println(objectListImperative.get(0));
        System.out.println(objectListImperative.size());
    }
}