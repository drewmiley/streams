package life.drewmiley;

import life.drewmiley.examples.ForEach;
import life.drewmiley.examples.Map;
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
        System.out.println("Running map example");
        runMap();
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

    private void runMap() {
        Map map = new Map();

        SimpleObject[] simpleObjects = objectGenerator.generateSimpleObjectArray();
        String[] mappedObjectsStream = map.runStreamForArray(simpleObjects);
        String[] mappedObjectsImperative = map.runImperativeForArray(simpleObjects);
//        System.out.println(mappedObjectsStream[0]);
//        System.out.println(mappedObjectsImperative[0]);
        List<SimpleObject> simpleObjectList = objectGenerator.generateSimpleObjectList();
        List<String> mappedObjectListStream = map.runStreamForList(simpleObjectList);
        List<String> mappedObjectListImperative = map.runImperativeForList(simpleObjectList);
//        System.out.println(mappedObjectListStream.get(0));
//        System.out.println(mappedObjectListImperative.get(0));
    }
}
