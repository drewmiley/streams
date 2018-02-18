package life.drewmiley.runners.complexchaining;

import life.drewmiley.helper.ObjectGenerator;

public class FilterFlatMapMapSortedReduce {
    public static void run(ObjectGenerator objectGenerator) {
        System.out.println("    -Filter, FlatMap, Map, Sorted, Reduce");
        life.drewmiley.examples.complexchaining.FilterFlatMapMapSortedReduce filterFlatMapMapSortedReduce = new life.drewmiley.examples.complexchaining.FilterFlatMapMapSortedReduce();

        String objectsStream = filterFlatMapMapSortedReduce.runStreamForArray(objectGenerator.generateComplexObjectArray());
        String objectsImperative = filterFlatMapMapSortedReduce.runImperatveForArray(objectGenerator.generateComplexObjectArray());
        System.out.println(objectsStream);
        System.out.println(objectsImperative);

        String objectListStream = filterFlatMapMapSortedReduce.runStreamForList(objectGenerator.generateComplexObjectList());
        String objectListImperative = filterFlatMapMapSortedReduce.runImperativeForList(objectGenerator.generateComplexObjectList());
        System.out.println(objectListStream);
        System.out.println(objectListImperative);
    }

    public static void main(String[] strings) {
        run(new ObjectGenerator());
    }
}