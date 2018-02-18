package life.drewmiley.runners.chaining;

import life.drewmiley.helper.ObjectGenerator;
import life.drewmiley.helper.SimpleObject;

import java.util.List;

public class MapReduce {
    public static void run(ObjectGenerator objectGenerator) {
        System.out.println("    -Map, Reduce");
        life.drewmiley.examples.chaining.MapReduce mapReduce = new life.drewmiley.examples.chaining.MapReduce();

        SimpleObject[] simpleObjects = objectGenerator.generateSimpleObjectArray();
        String objectsStream = mapReduce.runStreamForArray(simpleObjects);
        String objectsImperative = mapReduce.runImperativeForArray(simpleObjects);
        System.out.println(objectsStream);
        System.out.println(objectsImperative);

        List<SimpleObject> simpleObjectList = objectGenerator.generateSimpleObjectList();
        String objectListStream = mapReduce.runStreamForList(simpleObjectList);
        String objectListImperative = mapReduce.runStreamForImperative(simpleObjectList);
        System.out.println(objectListStream);
        System.out.println(objectListImperative);
    }
}