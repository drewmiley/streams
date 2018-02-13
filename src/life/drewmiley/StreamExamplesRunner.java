package life.drewmiley;

import life.drewmiley.examples.*;
import life.drewmiley.objects.SimpleObject;

import java.util.List;

public class StreamExamplesRunner extends Runner {

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
        System.out.println("Running flatMap example");
        runFlatMap();
        System.out.println("Running sorted example");
        runSorted();
        System.out.println("Running max example");
        runMax();
        System.out.println("Running reduce example");
        runReduce();
        System.out.println("Running example of side effects");
        runSideEffects();
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
//        System.out.println(allMatchObjectsStream);
//        System.out.println(allMatchObjectsImperative);

        List<SimpleObject> simpleObjectList = objectGenerator.generateSimpleObjectList();
        boolean allMatchObjectListStream = allMatch.runStreamForList(simpleObjectList);
        boolean allMatchObjectListImperative = allMatch.runImperativeForList(simpleObjectList);
//        System.out.println(allMatchObjectListStream);
//        System.out.println(allMatchObjectListImperative);
    }

    private void runFlatMap() {
        FlatMap flatMap = new FlatMap();

        SimpleObject[] flatMapObjectsStream = flatMap.runStreamForArray(objectGenerator.generateComplexObjectArray());
        SimpleObject[] flatMapObjectsImperative = flatMap.runImperativeForArray(objectGenerator.generateComplexObjectArray());
//        System.out.println(flatMapObjectsStream[0].getNumber() + flatMapObjectsStream[0].getText());
//        System.out.println(flatMapObjectsStream.length);
//        System.out.println(flatMapObjectsImperative[0].getNumber() + flatMapObjectsImperative[0].getText());
//        System.out.println(flatMapObjectsImperative.length);

        List<SimpleObject> flatMapObjectListStream = flatMap.runStreamForList(objectGenerator.generateComplexObjectList());
        List<SimpleObject> flatMapObjectListImperative = flatMap.runImperativeForList(objectGenerator.generateComplexObjectList());
//        System.out.println(flatMapObjectListStream.get(0).getNumber() + flatMapObjectListStream.get(0).getText());
//        System.out.println(flatMapObjectListStream.size());
//        System.out.println(flatMapObjectListImperative.get(0).getNumber() + flatMapObjectListImperative.get(0).getText());
//        System.out.println(flatMapObjectListImperative.size());
    }

    private void runSorted() {
        Sorted sorted = new Sorted();

        SimpleObject[] sortedObjectsStream = sorted.runStreamForArray(objectGenerator.generateSimpleObjectArray());
        SimpleObject[] sortedObjectsImperative = sorted.runImperativeForArray(objectGenerator.generateSimpleObjectArray());
//        System.out.println(sortedObjectsStream[0].getNumber() + sortedObjectsStream[0].getText());
//        System.out.println(sortedObjectsImperative[0].getNumber() + sortedObjectsImperative[0].getText());

        List<SimpleObject> sortedObjectListStream = sorted.runStreamForList(objectGenerator.generateSimpleObjectList());
        List<SimpleObject> sortedObjectListImperative = sorted.runImperativeForList(objectGenerator.generateSimpleObjectList());
//        System.out.println(sortedObjectListStream.get(0).getNumber() + sortedObjectListStream.get(0).getText());
//        System.out.println(sortedObjectListImperative.get(0).getNumber() + sortedObjectListImperative.get(0).getText());
    }

    private void runMax() {
        Max max = new Max();

        SimpleObject maxObjectsStream = max.runStreamForArray(objectGenerator.generateSimpleObjectArray());
        SimpleObject maxObjectsImperative = max.runImperativeForArray(objectGenerator.generateSimpleObjectArray());
//        System.out.println(maxObjectsStream.getNumber() + maxObjectsStream.getText());
//        System.out.println(maxObjectsImperative.getNumber() + maxObjectsImperative.getText());

        SimpleObject maxObjectListStream = max.runStreamForList(objectGenerator.generateSimpleObjectList());
        SimpleObject maxObjectListImperative = max.runImperativeForList(objectGenerator.generateSimpleObjectList());
//        System.out.println(maxObjectListStream.getNumber() + maxObjectListStream.getText());
//        System.out.println(maxObjectListImperative.getNumber() + maxObjectListImperative.getText());
    }
    
    private void runReduce() {
        Reduce reduce = new Reduce();

        SimpleObject reduceObjectsStream = reduce.runStreamForArray(objectGenerator.generateSimpleObjectArray());
        SimpleObject reduceObjectsImperative = reduce.runImperativeForArray(objectGenerator.generateSimpleObjectArray());
//        System.out.println(reduceObjectsStream.getNumber() + reduceObjectsStream.getText());
//        System.out.println(reduceObjectsImperative.getNumber() + reduceObjectsImperative.getText());

        SimpleObject reduceObjectListStream = reduce.runStreamForList(objectGenerator.generateSimpleObjectList());
        SimpleObject reduceObjectListImperative = reduce.runImperativeForList(objectGenerator.generateSimpleObjectList());
//        System.out.println(reduceObjectListStream.getNumber() + reduceObjectListStream.getText());
//        System.out.println(reduceObjectListImperative.getNumber() + reduceObjectListImperative.getText());
    }

    private void runSideEffects() {
        SideEffects sideEffects = new SideEffects();

        SimpleObject[] simpleObjects = objectGenerator.generateSimpleObjectArray();
        SimpleObject[] sideEffectsObjectsStream = sideEffects.runStreamForArray(simpleObjects);
        SimpleObject[] sideEffectsObjectsImperative = sideEffects.runImperativeForArray(simpleObjects);

        List<SimpleObject> simpleObjectList = objectGenerator.generateSimpleObjectList();
        List<SimpleObject> sideEffectsObjectListStream = sideEffects.runStreamForList(simpleObjectList);
        List<SimpleObject> sideEffectsObjectListImperative = sideEffects.runImperativeForList(simpleObjectList);
    }
}
