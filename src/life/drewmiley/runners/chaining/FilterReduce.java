package life.drewmiley.runners.chaining;

import life.drewmiley.helper.ObjectGenerator;
import life.drewmiley.helper.SimpleObject;

import java.util.List;

public class FilterReduce {
    public static void run(ObjectGenerator objectGenerator) {
        System.out.println("    -Filter, Reduce");
        life.drewmiley.examples.chaining.FilterReduce filterReduce = new life.drewmiley.examples.chaining.FilterReduce();

        SimpleObject[] simpleObjects = objectGenerator.generateSimpleObjectArray();
        SimpleObject objectsStream = filterReduce.runStreamForArray(simpleObjects);
        SimpleObject objectsImperative = filterReduce.runImperativeForArray(simpleObjects);
        System.out.println(objectsStream.getNumber() + objectsStream.getText());
        System.out.println(objectsImperative.getNumber() + objectsImperative.getText());

        List<SimpleObject> simpleObjectList = objectGenerator.generateSimpleObjectList();
        SimpleObject objectListStream = filterReduce.runStreamForList(simpleObjectList);
        SimpleObject objectListImperative = filterReduce.runImperativeForList(simpleObjectList);
        System.out.println(objectListStream.getNumber() + objectListStream.getText());
        System.out.println(objectListImperative.getNumber() + objectListImperative.getText());
    }

    public static void main(String[] strings) {
        run(new ObjectGenerator());
    }
}