package life.drewmiley;

import life.drewmiley.helper.ObjectGenerator;
import life.drewmiley.runners.chaining.*;
import life.drewmiley.runners.complexchaining.FilterFlatMapMapSortedReduce;
import life.drewmiley.runners.complexchaining.SortedMapFilterReduce;
import life.drewmiley.runners.impure.SideEffects;
import life.drewmiley.runners.single.*;

public class Main {

    public static void main(String[] args) {
        ObjectGenerator objectGenerator = new ObjectGenerator();

        AllMatch.run(objectGenerator);
        AnyMatch.run(objectGenerator);
        Filter.run(objectGenerator);
        FindFirst.run(objectGenerator);
        FlatMap.run(objectGenerator);
        ForEach.run(objectGenerator);
        Map.run(objectGenerator);
        Max.run(objectGenerator);
        Reduce.run(objectGenerator);
        Sorted.run(objectGenerator);

        SideEffects.run(objectGenerator);

        System.out.println("Running example of chaining methods");
        FilterFlatMap.run(objectGenerator);
        FilterMap.run(objectGenerator);
        FilterReduce.run(objectGenerator);
        FilterSorted.run(objectGenerator);
        FlatMapFilter.run(objectGenerator);
        FlatMapMap.run(objectGenerator);
        FlatMapReduce.run(objectGenerator);
        FlatMapSorted.run(objectGenerator);
        MapFilter.run(objectGenerator);
        MapReduce.run(objectGenerator);
        MapSorted.run(objectGenerator);
        SortedFlatMap.run(objectGenerator);
        SortedMap.run(objectGenerator);
        SortedReduce.run(objectGenerator);
        
        System.out.println("Running example of complex chaining methods");
        FilterFlatMapMapSortedReduce.run(objectGenerator);
        SortedMapFilterReduce.run(objectGenerator);
    }
}
