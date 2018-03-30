package life.drewmiley;

import life.drewmiley.runners.chaining.*;
import life.drewmiley.runners.complexchaining.FilterFlatMapMapSortedReduce;
import life.drewmiley.runners.complexchaining.SortedMapFilterReduce;
import life.drewmiley.runners.impure.SideEffects;
import life.drewmiley.runners.single.*;

public class Main {

    public static void main(String[] args) {
        AllMatch.main(new String[0]);
        AnyMatch.main(new String[0]);
        Filter.main(new String[0]);
        FindFirst.main(new String[0]);
        FlatMap.main(new String[0]);
        ForEach.main(new String[0]);
        Map.main(new String[0]);
        Max.main(new String[0]);
        Reduce.main(new String[0]);
        Sorted.main(new String[0]);

        SideEffects.main(new String[0]);

        System.out.println("Running example of chaining methods");
        FilterFlatMap.main(new String[0]);
        FilterMap.main(new String[0]);
        FilterReduce.main(new String[0]);
        FilterSorted.main(new String[0]);
        FindFirstFilter.main(new String[0]);
        FindFirstMap.main(new String[0]);
        FindFirstReduce.main(new String[0]);
        FindFirstSorted.main(new String[0]);
        FlatMapFilter.main(new String[0]);
        FlatMapMap.main(new String[0]);
        FlatMapReduce.main(new String[0]);
        FlatMapSorted.main(new String[0]);
        MaxFilter.main(new String[0]);
        MaxMap.main(new String[0]);
        MaxReduce.main(new String[0]);
        MaxSorted.main(new String[0]);
        MapFilter.main(new String[0]);
        MapReduce.main(new String[0]);
        MapSorted.main(new String[0]);
        SortedFlatMap.main(new String[0]);
        SortedMap.main(new String[0]);
        SortedReduce.main(new String[0]);
        
        System.out.println("Running example of complex chaining methods");
        FilterFlatMapMapSortedReduce.main(new String[0]);
        SortedMapFilterReduce.main(new String[0]);
    }
}
