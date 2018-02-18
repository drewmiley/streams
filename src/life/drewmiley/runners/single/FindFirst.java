package life.drewmiley.runners.single;

import life.drewmiley.helper.ObjectGenerator;
import life.drewmiley.helper.SimpleObject;

import java.util.List;

public class FindFirst {
    public static void run(ObjectGenerator objectGenerator) {
        System.out.println("Running findFirst example");
        life.drewmiley.examples.single.FindFirst findFirst = new life.drewmiley.examples.single.FindFirst();

        SimpleObject[] simpleObjects = objectGenerator.generateSimpleObjectArray();
        SimpleObject findFirstObjectsStream = findFirst.runStreamForArray(simpleObjects);
        SimpleObject findFirstObjectsImperative = findFirst.runImperativeForArray(simpleObjects);
        System.out.println(findFirstObjectsStream.getNumber() + findFirstObjectsStream.getText());
        System.out.println(findFirstObjectsImperative.getNumber() + findFirstObjectsImperative.getText());

        List<SimpleObject> simpleObjectList = objectGenerator.generateSimpleObjectList();
        SimpleObject findFirstObjectListStream = findFirst.runStreamForList(simpleObjectList);
        SimpleObject findFirstObjectListImperative = findFirst.runImperativeForList(simpleObjectList);
        System.out.println(findFirstObjectListStream.getNumber() + findFirstObjectListStream.getText());
        System.out.println(findFirstObjectListImperative.getNumber() + findFirstObjectListImperative.getText());
    }

    public static void main(String[] strings) {

    }
}