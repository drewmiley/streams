package life.drewmiley.runners;

import life.drewmiley.helper.ExampleRunner;
import life.drewmiley.runners.impure.SideEffects;
import life.drewmiley.runners.single.*;

public class StreamExamplesRunner extends ExampleRunner {

    public void run() {
        AllMatch.runAllMatch(objectGenerator);
        AnyMatch.runAnyMatch(objectGenerator);
        Filter.runFilter(objectGenerator);
        FindFirst.runFindFirst(objectGenerator);
        FlatMap.runFlatMap(objectGenerator);
        ForEach.runForEach(objectGenerator);
        Map.runMap(objectGenerator);
        Max.runMax(objectGenerator);
        Reduce.runReduce(objectGenerator);
        Sorted.runSorted(objectGenerator);

        SideEffects.runSideEffects(objectGenerator);
    }

}
