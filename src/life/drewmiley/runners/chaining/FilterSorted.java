package life.drewmiley.runners.chaining;

import life.drewmiley.helper.ObjectGenerator;
import life.drewmiley.helper.SimpleObject;

import java.util.List;

public class FilterSorted {
    public static void run(ObjectGenerator objectGenerator) {
        System.out.println("    -Filter, Sorted");
        life.drewmiley.examples.chaining.FilterSorted filterSorted = new life.drewmiley.examples.chaining.FilterSorted();

        SimpleObject[] simpleObjects = objectGenerator.generateSimpleObjectArray();
        SimpleObject[] objectsStream = filterSorted.runStreamForArray(simpleObjects);
        SimpleObject[] objectsImperative = filterSorted.runImperativeForArray(simpleObjects);
        System.out.println(objectsStream[0].getNumber() + objectsStream[0].getText());
        System.out.println(objectsStream.length);
        System.out.println(objectsImperative[0].getNumber() + objectsImperative[0].getText());
        System.out.println(objectsImperative.length);

        List<SimpleObject> simpleObjectList = objectGenerator.generateSimpleObjectList();
        List<SimpleObject> objectListStream = filterSorted.runStreamForList(simpleObjectList);
        List<SimpleObject> objectListImperative = filterSorted.runImperativeForList(simpleObjectList);
        System.out.println(objectListStream.get(0).getNumber() + objectListStream.get(0).getText());
        System.out.println(objectListStream.size());
        System.out.println(objectListImperative.get(0).getNumber() + objectListImperative.get(0).getText());
        System.out.println(objectListImperative.size());
    }

    public static void main(String[] strings) {
        run(new ObjectGenerator());
    }
}