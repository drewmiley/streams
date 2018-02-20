package life.drewmiley.runners.single;

import life.drewmiley.helper.ObjectGenerator;
import life.drewmiley.helper.SimpleObject;

public class Max {
    public static void run(ObjectGenerator objectGenerator) {
        System.out.println("Running max example");
        life.drewmiley.examples.single.Max max = new life.drewmiley.examples.single.Max();

        SimpleObject maxObjectsStream = max.runStreamForArray(objectGenerator.generateSimpleObjectArray());
        SimpleObject maxObjectsImperative = max.runImperativeForArray(objectGenerator.generateSimpleObjectArray());
        System.out.println(maxObjectsStream.getNumber() + maxObjectsStream.getText());
        System.out.println(maxObjectsImperative.getNumber() + maxObjectsImperative.getText());

        SimpleObject maxObjectListStream = max.runStreamForList(objectGenerator.generateSimpleObjectList());
        SimpleObject maxObjectListImperative = max.runImperativeForList(objectGenerator.generateSimpleObjectList());
        System.out.println(maxObjectListStream.getNumber() + maxObjectListStream.getText());
        System.out.println(maxObjectListImperative.getNumber() + maxObjectListImperative.getText());
    }

    public static void main(String[] strings) {
        run(new ObjectGenerator());
    }
}