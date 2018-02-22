package life.drewmiley.runners.chaining;

import life.drewmiley.helper.ObjectGenerator;

import java.util.List;

public class FindFirstMap {
    public static void run(ObjectGenerator objectGenerator) {
        System.out.println("    -FindFirst, Map");
        life.drewmiley.examples.chaining.FindFirstMap findFirstMap = new life.drewmiley.examples.chaining.FindFirstMap();

        String[] objectsStream = findFirstMap.runStreamForArray(objectGenerator.generateComplexObjectArray());
        String[] objectsImperative = findFirstMap.runImperativeForArray(objectGenerator.generateComplexObjectArray());
        System.out.println(objectsStream[0]);
        System.out.println(objectsStream.length);
        System.out.println(objectsImperative[0]);
        System.out.println(objectsImperative.length);

        List<String> objectListStream = findFirstMap.runStreamForList(objectGenerator.generateComplexObjectList());
        List<String> objectListImperative = findFirstMap.runImperativeForList(objectGenerator.generateComplexObjectList());
        System.out.println(objectListStream.get(0));
        System.out.println(objectListStream.size());
        System.out.println(objectListImperative.get(0));
        System.out.println(objectListImperative.size());
    }

    public static void main(String[] strings) {
        run(new ObjectGenerator());
    }
}
