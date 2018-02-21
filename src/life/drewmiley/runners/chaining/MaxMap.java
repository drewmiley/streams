package life.drewmiley.runners.chaining;

import life.drewmiley.helper.ObjectGenerator;

import java.util.List;

public class MaxMap {
    public static void run(ObjectGenerator objectGenerator) {
        System.out.println("    -Max, Map");
        life.drewmiley.examples.chaining.MaxMap maxMap = new life.drewmiley.examples.chaining.MaxMap();

        String[] objectsStream = maxMap.runStreamForArray(objectGenerator.generateComplexObjectArray());
        String[] objectsImperative = maxMap.runImperativeForArray(objectGenerator.generateComplexObjectArray());
        System.out.println(objectsStream[0]);
        System.out.println(objectsStream.length);
        System.out.println(objectsImperative[0]);
        System.out.println(objectsImperative.length);

        List<String> objectListStream = maxMap.runStreamForList(objectGenerator.generateComplexObjectList());
        List<String> objectListImperative = maxMap.runImperativeForList(objectGenerator.generateComplexObjectList());
        System.out.println(objectListStream.get(0));
        System.out.println(objectListStream.size());
        System.out.println(objectListImperative.get(0));
        System.out.println(objectListImperative.size());
    }

    public static void main(String[] strings) {
        run(new ObjectGenerator());
    }
}
