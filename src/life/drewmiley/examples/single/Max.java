package life.drewmiley.examples.single;

import life.drewmiley.examples.helper.InlineFunctions;
import life.drewmiley.examples.helper.SimpleObject;

import java.util.Arrays;
import java.util.List;

public class Max {

    public SimpleObject runStreamForArray(SimpleObject[] simpleObjects) {
        return Arrays.stream(simpleObjects)
                .max(InlineFunctions::arbitrarySorter).orElse(null);
    }

    public SimpleObject runImperativeForArray(SimpleObject[] simpleObjects) {
        SimpleObject[] array = simpleObjects;
        Arrays.sort(array, InlineFunctions::arbitrarySorter);
        return array[array.length - 1];
    }

    public SimpleObject runStreamForList(List<SimpleObject> simpleObjects) {
        return simpleObjects.stream()
                .max(InlineFunctions::arbitrarySorter).orElse(null);
    }

    public SimpleObject runImperativeForList(List<SimpleObject> simpleObjects) {
        List<SimpleObject> list = simpleObjects;
        list.sort(InlineFunctions::arbitrarySorter);
        return list.get(list.size() - 1);
    }
}
