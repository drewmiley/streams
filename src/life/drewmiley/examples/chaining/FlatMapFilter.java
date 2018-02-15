package life.drewmiley.examples.chaining;

import life.drewmiley.examples.helper.ComplexObject;
import life.drewmiley.examples.helper.SimpleObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapFilter {

    private boolean arbitraryFilter(SimpleObject simpleObject) {
        return simpleObject.getNumber() % 2 == 0;
    }

    public SimpleObject[] runStreamForArray(ComplexObject[] complexObjects) {
        return Arrays.stream(complexObjects)
                .flatMap(complexObject -> complexObject.getSimpleObjectList().stream())
                .filter(simpleObject -> arbitraryFilter(simpleObject))
                .toArray(SimpleObject[]::new);
    }

    public SimpleObject[] runImperativeForArray(ComplexObject[] complexObjects) {
        SimpleObject[] result = new SimpleObject[0];
        for (int i = 0; i < complexObjects.length; i++) {
            List<SimpleObject> simpleObjectList = complexObjects[i].getSimpleObjectList();
            for (SimpleObject simpleObject : simpleObjectList) {
                if (arbitraryFilter(simpleObject)) {
                    result = Arrays.copyOf(result, result.length + 1);
                    result[result.length - 1] = simpleObject;
                }
            }
        }
        return result;
    }

    public List<SimpleObject> runStreamForList(List<ComplexObject> complexObjectList) {
        return complexObjectList.stream()
                .flatMap(complexObject -> complexObject.getSimpleObjectList().stream())
                .filter(simpleObject -> arbitraryFilter(simpleObject))
                .collect(Collectors.toList());
    }

    public List<SimpleObject> runImperativeForList(List<ComplexObject> complexObjectList) {
        List<SimpleObject> result = new ArrayList<>();
        for (ComplexObject complexObject : complexObjectList) {
            List<SimpleObject> simpleObjectList = complexObject.getSimpleObjectList();
            for (SimpleObject simpleObject : simpleObjectList) {
                if (arbitraryFilter(simpleObject)) {
                    result.add(simpleObject);
                }
            }
        }
        return result;
    }
}
