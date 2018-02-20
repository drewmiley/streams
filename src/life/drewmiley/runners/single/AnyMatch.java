package life.drewmiley.runners.single;

import life.drewmiley.helper.ObjectGenerator;
import life.drewmiley.helper.SimpleObject;

import java.util.List;

public class AnyMatch {
    public static void run(ObjectGenerator objectGenerator) {
        System.out.println("Running anyMatch example");
        life.drewmiley.examples.single.AnyMatch anyMatch = new life.drewmiley.examples.single.AnyMatch();

        SimpleObject[] simpleObjects = objectGenerator.generateSimpleObjectArray();
        boolean anyMatchObjectsStream = anyMatch.runStreamForArray(simpleObjects);
        boolean anyMatchObjectsImperative = anyMatch.runImperativeForArray(simpleObjects);
        System.out.println(anyMatchObjectsStream);
        System.out.println(anyMatchObjectsImperative);

        List<SimpleObject> simpleObjectList = objectGenerator.generateSimpleObjectList();
        boolean anyMatchObjectListStream = anyMatch.runStreamForList(simpleObjectList);
        boolean anyMatchObjectListImperative = anyMatch.runImperativeForList(simpleObjectList);
        System.out.println(anyMatchObjectListStream);
        System.out.println(anyMatchObjectListImperative);
    }

    public static void main(String[] strings) {
        run(new ObjectGenerator());
    }
}