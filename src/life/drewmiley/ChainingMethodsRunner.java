package life.drewmiley;

import life.drewmiley.examples.chaining.FilterFlatMap;
import life.drewmiley.examples.chaining.FilterMap;
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
        runFilterSorted();
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

    private void runFilterSorted() {

    }

    private void runFlatMapFilter() {

    }

    private void runFlatMapMap() {

    }

    private void runFlatMapReduce() {

    }

    private void runFlatMapSorted() {

    }

    private void runMapFilter() {

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
