package life.drewmiley.runners.chaining;

import life.drewmiley.helper.ObjectGenerator;
import life.drewmiley.helper.SimpleObject;

import java.util.List;

public class FlatMapFilter {
    public static void run(ObjectGenerator objectGenerator) {
        System.out.println("    -FlatMap, Filter");
        life.drewmiley.examples.chaining.FlatMapFilter flatMapFilter = new life.drewmiley.examples.chaining.FlatMapFilter();

        SimpleObject[] objectsStream = flatMapFilter.runStreamForArray(objectGenerator.generateComplexObjectArray());
        SimpleObject[] objectsImperative = flatMapFilter.runImperativeForArray(objectGenerator.generateComplexObjectArray());
        System.out.println(objectsStream[0].getNumber() + objectsStream[0].getText());
        System.out.println(objectsStream.length);
        System.out.println(objectsImperative[0].getNumber() + objectsImperative[0].getText());
        System.out.println(objectsImperative.length);

        List<SimpleObject> objectListStream = flatMapFilter.runStreamForList(objectGenerator.generateComplexObjectList());
        List<SimpleObject> objectListImperative = flatMapFilter.runImperativeForList(objectGenerator.generateComplexObjectList());
        System.out.println(objectListStream.get(0).getNumber() + objectListStream.get(0).getText());
        System.out.println(objectListStream.size());
        System.out.println(objectListImperative.get(0).getNumber() + objectListImperative.get(0).getText());
        System.out.println(objectListImperative.size());
    }
}