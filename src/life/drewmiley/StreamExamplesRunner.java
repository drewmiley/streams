package life.drewmiley;

import life.drewmiley.examples.ForEach;
import life.drewmiley.objects.ObjectGenerator;
import life.drewmiley.objects.SimpleObject;

import java.util.List;

public class StreamExamplesRunner {

    private ObjectGenerator objectGenerator;

    public StreamExamplesRunner() {
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
