package life.drewmiley.runners.single;

import life.drewmiley.helper.ObjectGenerator;
import life.drewmiley.helper.SimpleObject;

import java.util.List;

public class FlatMap {
    public static void run(ObjectGenerator objectGenerator) {
        System.out.println("Running flatMap example");
        life.drewmiley.examples.single.FlatMap flatMap = new life.drewmiley.examples.single.FlatMap();

        SimpleObject[] flatMapObjectsStream = flatMap.runStreamForArray(objectGenerator.generateComplexObjectArray());
        SimpleObject[] flatMapObjectsImperative = flatMap.runImperativeForArray(objectGenerator.generateComplexObjectArray());
        System.out.println(flatMapObjectsStream[0].getNumber() + flatMapObjectsStream[0].getText());
        System.out.println(flatMapObjectsStream.length);
        System.out.println(flatMapObjectsImperative[0].getNumber() + flatMapObjectsImperative[0].getText());
        System.out.println(flatMapObjectsImperative.length);

        List<SimpleObject> flatMapObjectListStream = flatMap.runStreamForList(objectGenerator.generateComplexObjectList());
        List<SimpleObject> flatMapObjectListImperative = flatMap.runImperativeForList(objectGenerator.generateComplexObjectList());
        System.out.println(flatMapObjectListStream.get(0).getNumber() + flatMapObjectListStream.get(0).getText());
        System.out.println(flatMapObjectListStream.size());
        System.out.println(flatMapObjectListImperative.get(0).getNumber() + flatMapObjectListImperative.get(0).getText());
        System.out.println(flatMapObjectListImperative.size());
    }

    public static void main(String[] strings) {
        run(new ObjectGenerator());
    }
}