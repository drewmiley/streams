package life.drewmiley.examples.impure;

import life.drewmiley.examples.helper.SimpleObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SideEffects {

    private int number;

    private SimpleObject dummyMap(SimpleObject simpleObject) {
        return simpleObject;
    }

    private void arbitrarySideEffect() {
        number *= 2;
    }

    public SimpleObject[] runStreamForArray(SimpleObject[] simpleObjects) {
        number = 1;
        SimpleObject[] result = Arrays.stream(simpleObjects)
                .map(simpleObject -> {
                    arbitrarySideEffect();
                    return dummyMap(simpleObject);
                }).toArray(SimpleObject[]::new);
        System.out.println(number);
        return result;
    }

    public SimpleObject[] runImperativeForArray(SimpleObject[] simpleObjects) {
        number = 1;
        SimpleObject[] result = new SimpleObject[simpleObjects.length];
        for (int i = 0; i < simpleObjects.length; i++) {
            SimpleObject simpleObject = simpleObjects[i];
            arbitrarySideEffect();
            result[i] = dummyMap(simpleObject);
        }
        System.out.println(number);
        return result;
    }

    public List<SimpleObject> runStreamForList(List<SimpleObject> simpleObjectList) {
        number = 1;
        List<SimpleObject> result = simpleObjectList.stream()
                .map(simpleObject -> {
                    arbitrarySideEffect();
                    return dummyMap(simpleObject);
                }).collect(Collectors.toList());
        System.out.println(number);
        return result;
    }

    public List<SimpleObject> runImperativeForList(List<SimpleObject> simpleObjectList) {
        number = 1;
        List<SimpleObject> result = new ArrayList<>();
        for (SimpleObject simpleObject : simpleObjectList) {
            arbitrarySideEffect();
            result.add(dummyMap(simpleObject));
        }
        System.out.println(number);
        return result;
    }
}
