package life.drewmiley.runners.chaining;

import life.drewmiley.helper.ObjectGenerator;
import life.drewmiley.helper.SimpleObject;

import java.util.List;

public class FilterFlatMap {
    public static void run(ObjectGenerator objectGenerator) {
        System.out.println("    -Filter, FlatMap");
        life.drewmiley.examples.chaining.FilterFlatMap filterFlatMap = new life.drewmiley.examples.chaining.FilterFlatMap();

        SimpleObject[] objectsStream = filterFlatMap.runStreamForArray(objectGenerator.generateComplexObjectArray());
        SimpleObject[] objectsImperative = filterFlatMap.runImperativeForArray(objectGenerator.generateComplexObjectArray());
        System.out.println(objectsStream[0].getNumber() + objectsStream[0].getText());
        System.out.println(objectsStream.length);
        System.out.println(objectsImperative[0].getNumber() + objectsImperative[0].getText());
        System.out.println(objectsImperative.length);

        List<SimpleObject> objectListStream = filterFlatMap.runStreamForList(objectGenerator.generateComplexObjectList());
        List<SimpleObject> objectListImperative = filterFlatMap.runImperativeForList(objectGenerator.generateComplexObjectList());
        System.out.println(objectListStream.get(0).getNumber() + objectListStream.get(0).getText());
        System.out.println(objectListStream.size());
        System.out.println(objectListImperative.get(0).getNumber() + objectListImperative.get(0).getText());
        System.out.println(objectListImperative.size());
    }

    public static void main(String[] strings) {

    }
}