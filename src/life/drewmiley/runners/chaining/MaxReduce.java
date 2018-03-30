package life.drewmiley.runners.chaining;

import life.drewmiley.helper.ObjectGenerator;
import life.drewmiley.helper.SimpleObject;

public class MaxReduce {
    private static void run(ObjectGenerator objectGenerator) {
        System.out.println("    -Max, Reduce");
        life.drewmiley.examples.chaining.MaxReduce MaxReduce = new life.drewmiley.examples.chaining.MaxReduce();

        SimpleObject objectsStream = MaxReduce.runStreamForArray(objectGenerator.generateComplexObjectArray());
        SimpleObject objectsImperative = MaxReduce.runImperativeForArray(objectGenerator.generateComplexObjectArray());
        System.out.println(objectsStream.getNumber() + objectsStream.getText());
        System.out.println(objectsImperative.getNumber() + objectsImperative.getText());

        SimpleObject objectListStream = MaxReduce.runStreamForList(objectGenerator.generateComplexObjectList());
        SimpleObject objectListImperative = MaxReduce.runImperativeForList(objectGenerator.generateComplexObjectList());
        System.out.println(objectListStream.getNumber() + objectListStream.getText());
        System.out.println(objectListImperative.getNumber() + objectListImperative.getText());
    }

    public static void main(String[] strings) {
        run(new ObjectGenerator());
    }
}
