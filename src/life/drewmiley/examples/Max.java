package life.drewmiley.examples;

import life.drewmiley.examples.helper.SimpleObject;

import java.util.Arrays;
import java.util.List;

public class Max {

    private int arbitrarySorter(SimpleObject a, SimpleObject b) {
        return a.getNumber() - b.getNumber();
    }

    public SimpleObject runStreamForArray(SimpleObject[] simpleObjects) {
        return Arrays.stream(simpleObjects).max(this::arbitrarySorter).orElse(null);
    }

    public SimpleObject runImperativeForArray(SimpleObject[] simpleObjects) {
        SimpleObject[] array = simpleObjects;
        Arrays.sort(array, this::arbitrarySorter);
        return array[array.length - 1];
    }

    public SimpleObject runStreamForList(List<SimpleObject> simpleObjects) {
        return simpleObjects.stream()
                .max(this::arbitrarySorter).orElse(null);
    }

    public SimpleObject runImperativeForList(List<SimpleObject> simpleObjects) {
        List<SimpleObject> list = simpleObjects;
        list.sort(this::arbitrarySorter);
        return list.get(list.size() - 1);
    }
}
