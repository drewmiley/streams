package life.drewmiley.examples.chaining;

import life.drewmiley.objects.SimpleObject;

import java.util.Arrays;
import java.util.List;

public class MapReduce {

    private SimpleObject arbitraryObjectMapper(SimpleObject simpleObject) {
        return new SimpleObject(simpleObject.getNumber() + 10, simpleObject.getText().toUpperCase());
    }

    private String arbitraryMapper(SimpleObject simpleObject) {
        return (simpleObject.getNumber() + 10) + simpleObject.getText().toUpperCase();
    }

    public String runStreamForArray(SimpleObject[] simpleObjects) {
        return Arrays.stream(simpleObjects)
                .map(simpleObject -> arbitraryMapper(simpleObject))
                .reduce((a, b) -> a + b)
                .orElse(null);
    }

    public String runImperativeForArray(SimpleObject[] simpleObjects) {
        String result = "";
        for (int i = 0; i < simpleObjects.length; i++) {
            result += arbitraryMapper(simpleObjects[i]);
        }
        return result;
    }

    public String runStreamForList(List<SimpleObject> simpleObjectList) {
        return simpleObjectList.stream()
                .map(simpleObject -> arbitraryMapper(simpleObject))
                .reduce((a, b) -> a + b)
                .orElse(null);
    }

    public String runStreamForImperative(List<SimpleObject> simpleObjectList) {
        String result = "";
        for (SimpleObject simpleObject : simpleObjectList) {
            result += arbitraryMapper(simpleObject);
        }
        return result;
    }
}
