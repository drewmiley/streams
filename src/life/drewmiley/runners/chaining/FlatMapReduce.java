package life.drewmiley.runners.chaining;

import life.drewmiley.helper.ObjectGenerator;
import life.drewmiley.helper.SimpleObject;

public class FlatMapReduce {
    public static void run(ObjectGenerator objectGenerator) {
        System.out.println("    -FlatMap, Reduce");
        life.drewmiley.examples.chaining.FlatMapReduce flatMapReduce = new life.drewmiley.examples.chaining.FlatMapReduce();

        SimpleObject objectsStream = flatMapReduce.runStreamForArray(objectGenerator.generateComplexObjectArray());
        SimpleObject objectsImperative = flatMapReduce.runImperativeForArray(objectGenerator.generateComplexObjectArray());
        System.out.println(objectsStream.getNumber() + objectsStream.getText());
        System.out.println(objectsImperative.getNumber() + objectsImperative.getText());

        SimpleObject objectListStream = flatMapReduce.runStreamForList(objectGenerator.generateComplexObjectList());
        SimpleObject objectListImperative = flatMapReduce.runImperativeForList(objectGenerator.generateComplexObjectList());
        System.out.println(objectListStream.getNumber() + objectListStream.getText());
        System.out.println(objectListImperative.getNumber() + objectListImperative.getText());
    }

    public static void main(String[] strings) {

    }
}