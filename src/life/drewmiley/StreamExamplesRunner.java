package life.drewmiley;

import life.drewmiley.examples.*;
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
        System.out.println("Running filter example");
        runFilter();
        System.out.println("Running findFirst example");
        runFindFirst();
        System.out.println("Running anyMatch example");
        runAnyMatch();
        System.out.println("Running allMatch example");
        runAllMatch();
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

    private void runFilter() {
        Filter filter = new Filter();

        SimpleObject[] simpleObjects = objectGenerator.generateSimpleObjectArray();
        SimpleObject[] filterObjectsStream = filter.runStreamForArray(simpleObjects);
        SimpleObject[] filterObjectsImperative = filter.runImperativeForArray(simpleObjects);
//        System.out.println(filterObjectsStream[0].getNumber() + filterObjectsStream[0].getText());
//        System.out.println(filterObjectsStream.length);
//        System.out.println(filterObjectsImperative[0].getNumber() + filterObjectsImperative[0].getText());
//        System.out.println(filterObjectsImperative.length);

        List<SimpleObject> simpleObjectList = objectGenerator.generateSimpleObjectList();
        List<SimpleObject> filterObjectListStream = filter.runStreamForList(simpleObjectList);
        List<SimpleObject> filterObjectListImperative = filter.runImperativeForList(simpleObjectList);
//        System.out.println(filterObjectListStream.get(0).getNumber() + filterObjectListStream.get(0).getText());
//        System.out.println(filterObjectListStream.size());
//        System.out.println(filterObjectListImperative.get(0).getNumber() + filterObjectListImperative.get(0).getText());
//        System.out.println(filterObjectListImperative.size());
    }

    private void runFindFirst() {
        FindFirst findFirst = new FindFirst();

        SimpleObject[] simpleObjects = objectGenerator.generateSimpleObjectArray();
        SimpleObject findFirstObjectsStream = findFirst.runStreamForArray(simpleObjects);
        SimpleObject findFirstObjectsImperative = findFirst.runImperativeForArray(simpleObjects);
//        System.out.println(findFirstObjectsStream.getNumber() + findFirstObjectsStream.getText());
//        System.out.println(findFirstObjectsImperative.getNumber() + findFirstObjectsImperative.getText());

        List<SimpleObject> simpleObjectList = objectGenerator.generateSimpleObjectList();
        SimpleObject findFirstObjectListStream = findFirst.runStreamForList(simpleObjectList);
        SimpleObject findFirstObjectListImperative = findFirst.runImperativeForList(simpleObjectList);
//        System.out.println(findFirstObjectListStream.getNumber() + findFirstObjectListStream.getText());
//        System.out.println(findFirstObjectListImperative.getNumber() + findFirstObjectListImperative.getText());
    }

    private void runAnyMatch() {
        AnyMatch anyMatch = new AnyMatch();

        SimpleObject[] simpleObjects = objectGenerator.generateSimpleObjectArray();
        boolean anyMatchObjectsStream = anyMatch.runStreamForArray(simpleObjects);
        boolean anyMatchObjectsImperative = anyMatch.runImperativeForArray(simpleObjects);
//        System.out.println(anyMatchObjectsStream);
//        System.out.println(anyMatchObjectsImperative);

        List<SimpleObject> simpleObjectList = objectGenerator.generateSimpleObjectList();
        boolean anyMatchObjectListStream = anyMatch.runStreamForList(simpleObjectList);
        boolean anyMatchObjectListImperative = anyMatch.runImperativeForList(simpleObjectList);
//        System.out.println(anyMatchObjectListStream);
//        System.out.println(anyMatchObjectListImperative);
    }

    private void runAllMatch() {
        AllMatch allMatch = new AllMatch();

        SimpleObject[] simpleObjects = objectGenerator.generateSimpleObjectArray();
        boolean allMatchObjectsStream = allMatch.runStreamForArray(simpleObjects);
        boolean allMatchObjectsImperative = allMatch.runImperativeForArray(simpleObjects);
        System.out.println(allMatchObjectsStream);
        System.out.println(allMatchObjectsImperative);

        List<SimpleObject> simpleObjectList = objectGenerator.generateSimpleObjectList();
        boolean allMatchObjectListStream = allMatch.runStreamForList(simpleObjectList);
        boolean allMatchObjectListImperative = allMatch.runImperativeForList(simpleObjectList);
        System.out.println(allMatchObjectListStream);
        System.out.println(allMatchObjectListImperative);
    }
}
