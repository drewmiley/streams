package life.drewmiley;

import life.drewmiley.examples.ForEach;

import java.util.List;

public class StreamExamples {

    private ObjectGenerator objectGenerator;

    public StreamExamples() {
        this.objectGenerator = new ObjectGenerator();
    }

    public void run() {
        System.out.println("Running forEach example");
        runForEach();
    }

    private void runForEach() {
        ForEach forEach = new ForEach();

        SimpleObject[] simpleObjects = objectGenerator.generateSimpleObjectArray();
        forEach.runStreamForArray(simpleObjects);
        forEach.runImperativeForArray(simpleObjects);
        List<SimpleObject> simpleObjectList = objectGenerator.generateSimpleObjectList();
        forEach.runStreamForList(simpleObjectList);
        forEach.runImperativeForList(simpleObjectList);
    }
}
