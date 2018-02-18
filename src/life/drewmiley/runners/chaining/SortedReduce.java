package life.drewmiley.runners.chaining;

import life.drewmiley.helper.ObjectGenerator;
import life.drewmiley.helper.SimpleObject;

import java.util.List;

public class SortedReduce {
    public static void run(ObjectGenerator objectGenerator) {
        System.out.println("    -Sorted, Reduce");
        life.drewmiley.examples.chaining.SortedReduce sortedReduce = new life.drewmiley.examples.chaining.SortedReduce();

        SimpleObject[] simpleObjects = objectGenerator.generateSimpleObjectArray();
        SimpleObject objectsStream = sortedReduce.runStreamForArray(simpleObjects);
        SimpleObject objectsImperative = sortedReduce.runImperativeForArray(simpleObjects);
        System.out.println(objectsStream.getNumber() + objectsStream.getText());
        System.out.println(objectsImperative.getNumber() + objectsImperative.getText());

        List<SimpleObject> simpleObjectList = objectGenerator.generateSimpleObjectList();
        SimpleObject objectListStream = sortedReduce.runStreamForList(simpleObjectList);
        SimpleObject objectListImperative = sortedReduce.runImperativeForList(simpleObjectList);
        System.out.println(objectListStream.getNumber() + objectListStream.getText());
        System.out.println(objectListImperative.getNumber() + objectListImperative.getText());
    }

    public static void main(String[] strings) {

    }
}