package life.drewmiley.runners.single;

import life.drewmiley.helper.ObjectGenerator;
import life.drewmiley.helper.SimpleObject;

public class Reduce {
    public static void runReduce(ObjectGenerator objectGenerator) {
        System.out.println("Running reduce example");
        life.drewmiley.examples.single.Reduce reduce = new life.drewmiley.examples.single.Reduce();

        SimpleObject reduceObjectsStream = reduce.runStreamForArray(objectGenerator.generateSimpleObjectArray());
        SimpleObject reduceObjectsImperative = reduce.runImperativeForArray(objectGenerator.generateSimpleObjectArray());
        System.out.println(reduceObjectsStream.getNumber() + reduceObjectsStream.getText());
        System.out.println(reduceObjectsImperative.getNumber() + reduceObjectsImperative.getText());

        SimpleObject reduceObjectListStream = reduce.runStreamForList(objectGenerator.generateSimpleObjectList());
        SimpleObject reduceObjectListImperative = reduce.runImperativeForList(objectGenerator.generateSimpleObjectList());
        System.out.println(reduceObjectListStream.getNumber() + reduceObjectListStream.getText());
        System.out.println(reduceObjectListImperative.getNumber() + reduceObjectListImperative.getText());
    }
}