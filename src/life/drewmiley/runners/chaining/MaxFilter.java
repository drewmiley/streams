package life.drewmiley.runners.chaining;

import life.drewmiley.helper.ObjectGenerator;
import life.drewmiley.helper.SimpleObject;

import java.util.List;

public class MaxFilter {
    private static void run(ObjectGenerator objectGenerator) {
        System.out.println("    -Max, Filter");
        life.drewmiley.examples.chaining.MaxFilter MaxFilter = new life.drewmiley.examples.chaining.MaxFilter();

        SimpleObject[] objectsStream = MaxFilter.runStreamForArray(objectGenerator.generateComplexObjectArray());
        SimpleObject[] objectsImperative = MaxFilter.runImperativeForArray(objectGenerator.generateComplexObjectArray());
        System.out.println(objectsStream[0].getNumber() + objectsStream[0].getText());
        System.out.println(objectsStream.length);
        System.out.println(objectsImperative[0].getNumber() + objectsImperative[0].getText());
        System.out.println(objectsImperative.length);

        List<SimpleObject> objectListStream = MaxFilter.runStreamForList(objectGenerator.generateComplexObjectList());
        List<SimpleObject> objectListImperative = MaxFilter.runImperativeForList(objectGenerator.generateComplexObjectList());
        System.out.println(objectListStream.get(0).getNumber() + objectListStream.get(0).getText());
        System.out.println(objectListStream.size());
        System.out.println(objectListImperative.get(0).getNumber() + objectListImperative.get(0).getText());
        System.out.println(objectListImperative.size());
    }

    public static void main(String[] strings) {
        run(new ObjectGenerator());
    }
}
