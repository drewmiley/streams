package life.drewmiley.examples.chaining;

import life.drewmiley.examples.helper.ComplexObject;
import life.drewmiley.examples.helper.InlineFunctions;
import life.drewmiley.examples.helper.SimpleObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapMap {

    public String[] runStreamForArray(ComplexObject[] complexObjects) {
        return Arrays.stream(complexObjects)
                .flatMap(complexObject -> complexObject.getSimpleObjectList().stream())
                .map(simpleObject -> InlineFunctions.arbitraryMapper(simpleObject))
                .toArray(String[]::new);
    }

    public String[] runImperativeForArray(ComplexObject[] complexObjects) {
        String[] result = new String[0];
        for (int i = 0; i < complexObjects.length; i++) {
            List<SimpleObject> simpleObjectList = complexObjects[i].getSimpleObjectList();
            for (SimpleObject simpleObject : simpleObjectList) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = InlineFunctions.arbitraryMapper(simpleObject);
            }
        }
        return result;
    }

    public List<String> runStreamForList(List<ComplexObject> complexObjectList) {
        return complexObjectList.stream()
                .flatMap(complexObject -> complexObject.getSimpleObjectList().stream())
                .map(simpleObject -> InlineFunctions.arbitraryMapper(simpleObject))
                .collect(Collectors.toList());
    }

    public List<String> runImperativeForList(List<ComplexObject> complexObjectList) {
        List<String> result = new ArrayList<>();
        for (ComplexObject complexObject : complexObjectList) {
            List<SimpleObject> simpleObjectList = complexObject.getSimpleObjectList();
            for (SimpleObject simpleObject : simpleObjectList) {
                result.add(InlineFunctions.arbitraryMapper(simpleObject));
            }
        }
        return result;
    }
}
