package life.drewmiley.runners.chaining;

import life.drewmiley.helper.ObjectGenerator;

import java.util.List;

public class FlatMapMap {
    public static void run(ObjectGenerator objectGenerator) {
        System.out.println("    -FlatMap, Map");
        life.drewmiley.examples.chaining.FlatMapMap flatMapMap = new life.drewmiley.examples.chaining.FlatMapMap();

        String[] objectsStream = flatMapMap.runStreamForArray(objectGenerator.generateComplexObjectArray());
        String[] objectsImperative = flatMapMap.runImperativeForArray(objectGenerator.generateComplexObjectArray());
        System.out.println(objectsStream[0]);
        System.out.println(objectsStream.length);
        System.out.println(objectsImperative[0]);
        System.out.println(objectsImperative.length);

        List<String> objectListStream = flatMapMap.runStreamForList(objectGenerator.generateComplexObjectList());
        List<String> objectListImperative = flatMapMap.runImperativeForList(objectGenerator.generateComplexObjectList());
        System.out.println(objectListStream.get(0));
        System.out.println(objectListStream.size());
        System.out.println(objectListImperative.get(0));
        System.out.println(objectListImperative.size());
    }

    public static void main(String[] strings) {
        run(new ObjectGenerator());
    }
}