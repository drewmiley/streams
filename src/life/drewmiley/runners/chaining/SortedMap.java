package life.drewmiley.runners.chaining;

import life.drewmiley.helper.ObjectGenerator;
import life.drewmiley.helper.SimpleObject;

import java.util.List;

public class SortedMap {
    public static void run(ObjectGenerator objectGenerator) {
        System.out.println("    -Sorted, Map");
        life.drewmiley.examples.chaining.SortedMap sortedMap = new life.drewmiley.examples.chaining.SortedMap();

        SimpleObject[] simpleObjects = objectGenerator.generateSimpleObjectArray();
        String[] objectsStream = sortedMap.runStreamForArray(simpleObjects);
        String[] objectsImperative = sortedMap.runImperativeForArray(simpleObjects);
        System.out.println(objectsStream[0]);
        System.out.println(objectsStream.length);
        System.out.println(objectsImperative[0]);
        System.out.println(objectsImperative.length);

        List<SimpleObject> simpleObjectList = objectGenerator.generateSimpleObjectList();
        List<String> objectListStream = sortedMap.runStreamForList(simpleObjectList);
        List<String> objectListImperative = sortedMap.runImperativeForList(simpleObjectList);
        System.out.println(objectListStream.get(0));
        System.out.println(objectListStream.size());
        System.out.println(objectListImperative.get(0));
        System.out.println(objectListImperative.size());
    }

    public static void main(String[] strings) {
        run(new ObjectGenerator());
    }
}