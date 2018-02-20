package life.drewmiley.examples.impure;

import life.drewmiley.helper.SimpleObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SideEffects {

    private int number;

    public SideEffects() {
        this.resetNumber();
    }

    private SimpleObject dummyMap(SimpleObject simpleObject) {
        return simpleObject;
    }

    private void sideEffect() {
        this.number *= 2;
    }

    private void resetNumber() {
        this.number = 1;
    }

    public int getNumber() {
        return this.number;
    }

    public SimpleObject[] runStreamForArray(SimpleObject[] simpleObjects) {
        SimpleObject[] result = Arrays.stream(simpleObjects)
                .map(simpleObject -> {
                    sideEffect();
                    return dummyMap(simpleObject);
                }).toArray(SimpleObject[]::new);
        System.out.println(number);
        return result;
    }

    public SimpleObject[] runImperativeForArray(SimpleObject[] simpleObjects) {
        SimpleObject[] result = new SimpleObject[simpleObjects.length];
        for (int i = 0; i < simpleObjects.length; i++) {
            SimpleObject simpleObject = simpleObjects[i];
            sideEffect();
            result[i] = dummyMap(simpleObject);
        }
        System.out.println(number);
        return result;
    }

    public List<SimpleObject> runStreamForList(List<SimpleObject> simpleObjectList) {
        List<SimpleObject> result = simpleObjectList.stream()
                .map(simpleObject -> {
                    sideEffect();
                    return dummyMap(simpleObject);
                }).collect(Collectors.toList());
        System.out.println(number);
        return result;
    }

    public List<SimpleObject> runImperativeForList(List<SimpleObject> simpleObjectList) {
        List<SimpleObject> result = new ArrayList<>();
        for (SimpleObject simpleObject : simpleObjectList) {
            sideEffect();
            result.add(dummyMap(simpleObject));
        }
        System.out.println(number);
        return result;
    }
}
