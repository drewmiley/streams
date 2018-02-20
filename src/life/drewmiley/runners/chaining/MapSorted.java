package life.drewmiley.runners.chaining;

import life.drewmiley.helper.ObjectGenerator;
import life.drewmiley.helper.SimpleObject;

import java.util.List;

public class MapSorted {
    public static void run(ObjectGenerator objectGenerator) {
        System.out.println("    -Map, Sorted");
        life.drewmiley.examples.chaining.MapSorted mapSorted = new life.drewmiley.examples.chaining.MapSorted();

        SimpleObject[] simpleObjects = objectGenerator.generateSimpleObjectArray();
        String[] objectsStream = mapSorted.runStreamForArray(simpleObjects);
        String[] objectsImperative = mapSorted.runImperativeForArray(simpleObjects);
        System.out.println(objectsStream[0]);
        System.out.println(objectsStream.length);
        System.out.println(objectsImperative[0]);
        System.out.println(objectsImperative.length);

        List<SimpleObject> simpleObjectList = objectGenerator.generateSimpleObjectList();
        List<String> objectListStream = mapSorted.runStreamForList(simpleObjectList);
        List<String> objectListImperative = mapSorted.runImperativeForList(simpleObjectList);
        System.out.println(objectListStream.get(0));
        System.out.println(objectListStream.size());
        System.out.println(objectListImperative.get(0));
        System.out.println(objectListImperative.size());
    }

    public static void main(String[] strings) {
        run(new ObjectGenerator());
    }
}