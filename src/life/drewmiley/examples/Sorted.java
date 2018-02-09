package life.drewmiley.examples;

import life.drewmiley.objects.SimpleObject;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {

    private int arbitrarySorter(SimpleObject a, SimpleObject b) {
        return a.getNumber() - b.getNumber();
    }

    public SimpleObject[] runStreamForArray(SimpleObject[] simpleObjects) {
        return Arrays.stream(simpleObjects)
                .sorted(this::arbitrarySorter).toArray(SimpleObject[]::new);
    }

    public SimpleObject[] runImperativeForArray(SimpleObject[] simpleObjects) {
        SimpleObject[] array = simpleObjects;
        Arrays.sort(array, this::arbitrarySorter);
        return array;
    }

    public List<SimpleObject> runStreamForList(List<SimpleObject> simpleObjects) {
        return simpleObjects.stream()
                .sorted(this::arbitrarySorter).collect(Collectors.toList());
    }

    public List<SimpleObject> runImperativeForList(List<SimpleObject> simpleObjects) {
        List<SimpleObject> list = simpleObjects;
        list.sort(this::arbitrarySorter);
        return list;
    }
}
