package life.drewmiley.examples.single;

import life.drewmiley.examples.helper.InlineFunctions;
import life.drewmiley.examples.helper.SimpleObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {

    public SimpleObject[] runStreamForArray(SimpleObject[] simpleObjects) {
        return Arrays.stream(simpleObjects)
                .sorted(InlineFunctions::arbitrarySorter).toArray(SimpleObject[]::new);
    }

    public SimpleObject[] runImperativeForArray(SimpleObject[] simpleObjects) {
        SimpleObject[] array = Arrays.copyOf(simpleObjects, simpleObjects.length);
        Arrays.sort(array, InlineFunctions::arbitrarySorter);
        return array;
    }

    public List<SimpleObject> runStreamForList(List<SimpleObject> simpleObjects) {
        return simpleObjects.stream()
                .sorted(InlineFunctions::arbitrarySorter).collect(Collectors.toList());
    }

    public List<SimpleObject> runImperativeForList(List<SimpleObject> simpleObjects) {
        List<SimpleObject> list = new ArrayList<>(simpleObjects);
        list.sort(InlineFunctions::arbitrarySorter);
        return list;
    }
}
