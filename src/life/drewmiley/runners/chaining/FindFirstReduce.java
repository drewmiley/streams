package life.drewmiley.runners.chaining;

import life.drewmiley.helper.ObjectGenerator;
import life.drewmiley.helper.SimpleObject;

public class FindFirstReduce {
    private static void run(ObjectGenerator objectGenerator) {
        System.out.println("    -FindFirst, Reduce");
        life.drewmiley.examples.chaining.FindFirstReduce FindFirstReduce = new life.drewmiley.examples.chaining.FindFirstReduce();

        SimpleObject objectsStream = FindFirstReduce.runStreamForArray(objectGenerator.generateComplexObjectArray());
        SimpleObject objectsImperative = FindFirstReduce.runImperativeForArray(objectGenerator.generateComplexObjectArray());
        System.out.println(objectsStream.getNumber() + objectsStream.getText());
        System.out.println(objectsImperative.getNumber() + objectsImperative.getText());

        SimpleObject objectListStream = FindFirstReduce.runStreamForList(objectGenerator.generateComplexObjectList());
        SimpleObject objectListImperative = FindFirstReduce.runImperativeForList(objectGenerator.generateComplexObjectList());
        System.out.println(objectListStream.getNumber() + objectListStream.getText());
        System.out.println(objectListImperative.getNumber() + objectListImperative.getText());
    }

    public static void main(String[] strings) {
        run(new ObjectGenerator());
    }
}
