package life.drewmiley;

import life.drewmiley.helper.ObjectGenerator;
import life.drewmiley.runners.ChainingMethodsRunner;
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

	    new ChainingMethodsRunner().run();
    }
}
