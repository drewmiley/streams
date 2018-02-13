package life.drewmiley;

import life.drewmiley.examples.chaining.*;
import life.drewmiley.objects.SimpleObject;

import java.util.List;

public class ChainingMethodsRunner extends Runner {

    public void run() {
        System.out.println("Running example of chaining methods");
        System.out.println("    -Filter, FlatMap");
        runFilterFlatMap();
        System.out.println("    -Filter, Map");
        runFilterMap();
        System.out.println("    -Filter, Reduce");
        runFilterReduce();
        System.out.println("    -Filter, Sorted");
        runFilterSorted();
        System.out.println("    -FlatMap, Filter");
        runFlatMapFilter();
        System.out.println("    -FlatMap, Map");
        runFlatMapMap();
        System.out.println("    -FlatMap, Reduce");
        runFlatMapReduce();
        System.out.println("    -FlatMap, Sorted");
        runFlatMapSorted();
        System.out.println("    -Map, Filter");
        runMapFilter();
        System.out.println("    -Map, Reduce");
        runMapReduce();
        System.out.println("    -Map, Sorted");
        runMapSorted();
        System.out.println("    -Sorted, Filter");
        runSortedFilter();
        System.out.println("    -Sorted, FlatMap");
        runSortedFlatMap();
        System.out.println("    -Sorted, Map");
        runSortedMap();
        System.out.println("    -Sorted, Reduce");
        runSortedReduce();
        System.out.println("    -Filter, FlatMap, Map, Sorted, Reduce");
        runFilterFlatMapMapSortedReduce();
        System.out.println("    -Sorted, Map, Filter, Reduce");
        runSortedMapFilterReduce();
    }

    private void runFilterFlatMap() {
        FilterFlatMap filterFlatMap = new FilterFlatMap();

        SimpleObject[] objectsStream = filterFlatMap.runStreamForArray(objectGenerator.generateComplexObjectArray());
        SimpleObject[] objectsImperative = filterFlatMap.runImperativeForArray(objectGenerator.generateComplexObjectArray());
//        System.out.println(objectsStream[0].getNumber() + objectsStream[0].getText());
//        System.out.println(objectsStream.length);
//        System.out.println(objectsImperative[0].getNumber() + objectsImperative[0].getText());
//        System.out.println(objectsImperative.length);

        List<SimpleObject> objectListStream = filterFlatMap.runStreamForList(objectGenerator.generateComplexObjectList());
        List<SimpleObject> objectListImperative = filterFlatMap.runImperativeForList(objectGenerator.generateComplexObjectList());
//        System.out.println(objectListStream.get(0).getNumber() + objectListStream.get(0).getText());
//        System.out.println(objectListStream.size());
//        System.out.println(objectListImperative.get(0).getNumber() + objectListImperative.get(0).getText());
//        System.out.println(objectListImperative.size());
    }

    private void runFilterMap() {
        FilterMap filterMap = new FilterMap();

        SimpleObject[] simpleObjects = objectGenerator.generateSimpleObjectArray();
        String[] objectsStream = filterMap.runStreamForArray(simpleObjects);
        String[] objectsImperative = filterMap.runImperativeForArray(simpleObjects);
//        System.out.println(objectsStream[0]);
//        System.out.println(objectsStream.length);
//        System.out.println(objectsImperative[0]);
//        System.out.println(objectsImperative.length);

        List<SimpleObject> simpleObjectList = objectGenerator.generateSimpleObjectList();
        List<String> objectListStream = filterMap.runStreamForList(simpleObjectList);
        List<String> objectListImperative = filterMap.runImperativeForList(simpleObjectList);
//        System.out.println(objectListStream.get(0));
//        System.out.println(objectListStream.size());
//        System.out.println(objectListImperative.get(0));
//        System.out.println(objectListImperative.size());
    }

    private void runFilterReduce() {
        FilterReduce filterReduce = new FilterReduce();

        SimpleObject[] simpleObjects = objectGenerator.generateSimpleObjectArray();
        SimpleObject objectsStream = filterReduce.runStreamForArray(simpleObjects);
        SimpleObject objectsImperative = filterReduce.runImperativeForArray(simpleObjects);
//        System.out.println(objectsStream.getNumber() + objectsStream.getText());
//        System.out.println(objectsImperative.getNumber() + objectsImperative.getText());

        List<SimpleObject> simpleObjectList = objectGenerator.generateSimpleObjectList();
        SimpleObject objectListStream = filterReduce.runStreamForList(simpleObjectList);
        SimpleObject objectListImperative = filterReduce.runImperativeForList(simpleObjectList);
//        System.out.println(objectListStream.getNumber() + objectListStream.getText());
//        System.out.println(objectListImperative.getNumber() + objectListImperative.getText());
    }

    private void runFilterSorted() {
        FilterSorted filterSorted = new FilterSorted();

        SimpleObject[] simpleObjects = objectGenerator.generateSimpleObjectArray();
        SimpleObject[] objectsStream = filterSorted.runStreamForArray(simpleObjects);
        SimpleObject[] objectsImperative = filterSorted.runImperativeForArray(simpleObjects);
//        System.out.println(objectsStream[0].getNumber() + objectsStream[0].getText());
//        System.out.println(objectsStream.length);
//        System.out.println(objectsImperative[0].getNumber() + objectsImperative[0].getText());
//        System.out.println(objectsImperative.length);

        List<SimpleObject> simpleObjectList = objectGenerator.generateSimpleObjectList();
        List<SimpleObject> objectListStream = filterSorted.runStreamForList(simpleObjectList);
        List<SimpleObject> objectListImperative = filterSorted.runImperativeForList(simpleObjectList);
//        System.out.println(objectListStream.get(0).getNumber() + objectListStream.get(0).getText());
//        System.out.println(objectListStream.size());
//        System.out.println(objectListImperative.get(0).getNumber() + objectListImperative.get(0).getText());
//        System.out.println(objectListImperative.size());
    }

    private void runFlatMapFilter() {
        FlatMapFilter flatMapFilter = new FlatMapFilter();

        SimpleObject[] objectsStream = flatMapFilter.runStreamForArray(objectGenerator.generateComplexObjectArray());
        SimpleObject[] objectsImperative = flatMapFilter.runImperativeForArray(objectGenerator.generateComplexObjectArray());
//        System.out.println(objectsStream[0].getNumber() + objectsStream[0].getText());
//        System.out.println(objectsStream.length);
//        System.out.println(objectsImperative[0].getNumber() + objectsImperative[0].getText());
//        System.out.println(objectsImperative.length);

        List<SimpleObject> objectListStream = flatMapFilter.runStreamForList(objectGenerator.generateComplexObjectList());
        List<SimpleObject> objectListImperative = flatMapFilter.runImperativeForList(objectGenerator.generateComplexObjectList());
//        System.out.println(objectListStream.get(0).getNumber() + objectListStream.get(0).getText());
//        System.out.println(objectListStream.size());
//        System.out.println(objectListImperative.get(0).getNumber() + objectListImperative.get(0).getText());
//        System.out.println(objectListImperative.size());
    }

    private void runFlatMapMap() {
        FlatMapMap flatMapMap = new FlatMapMap();

        String[] objectsStream = flatMapMap.runStreamForArray(objectGenerator.generateComplexObjectArray());
        String[] objectsImperative = flatMapMap.runImperativeForArray(objectGenerator.generateComplexObjectArray());
//        System.out.println(objectsStream[0]);
//        System.out.println(objectsStream.length);
//        System.out.println(objectsImperative[0]);
//        System.out.println(objectsImperative.length);

        List<String> objectListStream = flatMapMap.runStreamForList(objectGenerator.generateComplexObjectList());
        List<String> objectListImperative = flatMapMap.runImperativeForList(objectGenerator.generateComplexObjectList());
//        System.out.println(objectListStream.get(0));
//        System.out.println(objectListStream.size());
//        System.out.println(objectListImperative.get(0));
//        System.out.println(objectListImperative.size());
    }

    private void runFlatMapReduce() {
        FlatMapReduce flatMapReduce = new FlatMapReduce();

        SimpleObject objectsStream = flatMapReduce.runStreamForArray(objectGenerator.generateComplexObjectArray());
        SimpleObject objectsImperative = flatMapReduce.runImperativeForArray(objectGenerator.generateComplexObjectArray());
//        System.out.println(objectsStream.getNumber() + objectsStream.getText());
//        System.out.println(objectsImperative.getNumber() + objectsImperative.getText());

        SimpleObject objectListStream = flatMapReduce.runStreamForList(objectGenerator.generateComplexObjectList());
        SimpleObject objectListImperative = flatMapReduce.runImperativeForList(objectGenerator.generateComplexObjectList());
//        System.out.println(objectListStream.getNumber() + objectListStream.getText());
//        System.out.println(objectListImperative.getNumber() + objectListImperative.getText());
    }

    private void runFlatMapSorted() {
        FlatMapSorted flatMapSorted = new FlatMapSorted();

        SimpleObject[] objectsStream = flatMapSorted.runStreamForArray(objectGenerator.generateComplexObjectArray());
        SimpleObject[] objectsImperative = flatMapSorted.runImperativeForArray(objectGenerator.generateComplexObjectArray());
//        System.out.println(objectsStream[0].getNumber() + objectsStream[0].getText());
//        System.out.println(objectsStream.length);
//        System.out.println(objectsImperative[0].getNumber() + objectsImperative[0].getText());
//        System.out.println(objectsImperative.length);

        List<SimpleObject> objectListStream = flatMapSorted.runStreamForList(objectGenerator.generateComplexObjectList());
        List<SimpleObject> objectListImperative = flatMapSorted.runImperativeForList(objectGenerator.generateComplexObjectList());
//        System.out.println(objectListStream.get(0).getNumber() + objectListStream.get(0).getText());
//        System.out.println(objectListStream.size());
//        System.out.println(objectListImperative.get(0).getNumber() + objectListImperative.get(0).getText());
//        System.out.println(objectListImperative.size());
    }

    private void runMapFilter() {
        MapFilter mapFilter = new MapFilter();

        SimpleObject[] simpleObjects = objectGenerator.generateSimpleObjectArray();
        String[] objectsStream = mapFilter.runStreamForArray(simpleObjects);
        String[] objectsImperative = mapFilter.runImperativeForArray(simpleObjects);
        System.out.println(objectsStream[0]);
        System.out.println(objectsStream.length);
        System.out.println(objectsImperative[0]);
        System.out.println(objectsImperative.length);

        List<SimpleObject> simpleObjectList = objectGenerator.generateSimpleObjectList();
        List<String> objectListStream = mapFilter.runStreamForList(simpleObjectList);
        List<String> objectListImperative = mapFilter.runImperativeForList(simpleObjectList);
        System.out.println(objectListStream.get(0));
        System.out.println(objectListStream.size());
        System.out.println(objectListImperative.get(0));
        System.out.println(objectListImperative.size());
    }

    private void runMapReduce() {

    }

    private void runMapSorted() {

    }

    private void runSortedFilter() {

    }

    private void runSortedFlatMap() {

    }

    private void runSortedMap() {

    }

    private void runSortedReduce() {

    }

    private void runFilterFlatMapMapSortedReduce() {

    }

    private void runSortedMapFilterReduce() {

    }
}
