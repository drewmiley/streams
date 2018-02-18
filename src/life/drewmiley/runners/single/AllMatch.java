package life.drewmiley.runners.single;

import life.drewmiley.helper.ObjectGenerator;
import life.drewmiley.helper.SimpleObject;

import java.util.List;

public class AllMatch {
    public static void run(ObjectGenerator objectGenerator) {
        System.out.println("Running allMatch example");
        life.drewmiley.examples.single.AllMatch allMatch = new life.drewmiley.examples.single.AllMatch();

        SimpleObject[] simpleObjects = objectGenerator.generateSimpleObjectArray();
        boolean allMatchObjectsStream = allMatch.runStreamForArray(simpleObjects);
        boolean allMatchObjectsImperative = allMatch.runImperativeForArray(simpleObjects);
        System.out.println(allMatchObjectsStream);
        System.out.println(allMatchObjectsImperative);

        List<SimpleObject> simpleObjectList = objectGenerator.generateSimpleObjectList();
        boolean allMatchObjectListStream = allMatch.runStreamForList(simpleObjectList);
        boolean allMatchObjectListImperative = allMatch.runImperativeForList(simpleObjectList);
        System.out.println(allMatchObjectListStream);
        System.out.println(allMatchObjectListImperative);
    }

    public static void main(String[] strings) {

    }
}