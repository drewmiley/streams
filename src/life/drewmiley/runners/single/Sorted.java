package life.drewmiley.runners.single;

import life.drewmiley.helper.ObjectGenerator;
import life.drewmiley.helper.SimpleObject;

import java.util.List;

public class Sorted {
    public static void run(ObjectGenerator objectGenerator) {
        System.out.println("Running sorted example");
        life.drewmiley.examples.single.Sorted sorted = new life.drewmiley.examples.single.Sorted();

        SimpleObject[] sortedObjectsStream = sorted.runStreamForArray(objectGenerator.generateSimpleObjectArray());
        SimpleObject[] sortedObjectsImperative = sorted.runImperativeForArray(objectGenerator.generateSimpleObjectArray());
        System.out.println(sortedObjectsStream[0].getNumber() + sortedObjectsStream[0].getText());
        System.out.println(sortedObjectsImperative[0].getNumber() + sortedObjectsImperative[0].getText());

        List<SimpleObject> sortedObjectListStream = sorted.runStreamForList(objectGenerator.generateSimpleObjectList());
        List<SimpleObject> sortedObjectListImperative = sorted.runImperativeForList(objectGenerator.generateSimpleObjectList());
        System.out.println(sortedObjectListStream.get(0).getNumber() + sortedObjectListStream.get(0).getText());
        System.out.println(sortedObjectListImperative.get(0).getNumber() + sortedObjectListImperative.get(0).getText());
    }

    public static void main(String[] strings) {
        run(new ObjectGenerator());
    }
}