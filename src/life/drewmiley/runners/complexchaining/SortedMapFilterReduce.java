package life.drewmiley.runners.complexchaining;

import life.drewmiley.helper.ObjectGenerator;
import life.drewmiley.helper.SimpleObject;

import java.util.List;

public class SortedMapFilterReduce {
    public static void run(ObjectGenerator objectGenerator) {
        System.out.println("    -Sorted, Map, Filter, Reduce");
        life.drewmiley.examples.complexchaining.SortedMapFilterReduce sortedMapFilterReduce = new life.drewmiley.examples.complexchaining.SortedMapFilterReduce();

        SimpleObject[] simpleObjects = objectGenerator.generateSimpleObjectArray();
        String objectsStream = sortedMapFilterReduce.runStreamForArray(simpleObjects);
        String objectsImperative = sortedMapFilterReduce.runImperativeForArray(simpleObjects);
        System.out.println(objectsStream);
        System.out.println(objectsImperative);

        List<SimpleObject> simpleObjectList = objectGenerator.generateSimpleObjectList();
        String objectListStream = sortedMapFilterReduce.runStreamForList(simpleObjectList);
        String objectListImperative = sortedMapFilterReduce.runImperativeForList(simpleObjectList);
        System.out.println(objectListStream);
        System.out.println(objectListImperative);
    }

    public static void main(String[] strings) {
        run(new ObjectGenerator());
    }
}