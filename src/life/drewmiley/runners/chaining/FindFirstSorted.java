package life.drewmiley.runners.chaining;

import life.drewmiley.helper.ObjectGenerator;
import life.drewmiley.helper.SimpleObject;

import java.util.List;

public class FindFirstSorted {
    private static void run(ObjectGenerator objectGenerator) {
        System.out.println("    -FindFirst, Sorted");
        life.drewmiley.examples.chaining.FindFirstSorted FindFirstSorted = new life.drewmiley.examples.chaining.FindFirstSorted();

        SimpleObject[] objectsStream = FindFirstSorted.runStreamForArray(objectGenerator.generateComplexObjectArray());
        SimpleObject[] objectsImperative = FindFirstSorted.runImperativeForArray(objectGenerator.generateComplexObjectArray());
        System.out.println(objectsStream[0].getNumber() + objectsStream[0].getText());
        System.out.println(objectsStream.length);
        System.out.println(objectsImperative[0].getNumber() + objectsImperative[0].getText());
        System.out.println(objectsImperative.length);

        List<SimpleObject> objectListStream = FindFirstSorted.runStreamForList(objectGenerator.generateComplexObjectList());
        List<SimpleObject> objectListImperative = FindFirstSorted.runImperativeForList(objectGenerator.generateComplexObjectList());
        System.out.println(objectListStream.get(0).getNumber() + objectListStream.get(0).getText());
        System.out.println(objectListStream.size());
        System.out.println(objectListImperative.get(0).getNumber() + objectListImperative.get(0).getText());
        System.out.println(objectListImperative.size());
    }

    public static void main(String[] strings) {
        run(new ObjectGenerator());
    }
}
