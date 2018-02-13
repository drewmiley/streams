package life.drewmiley.examples.chaining;

import life.drewmiley.objects.SimpleObject;

import java.util.Arrays;
import java.util.List;

public class FilterReduce {

    private boolean arbitraryFilter(SimpleObject simpleObject) {
        return simpleObject.getNumber() % 2 == 0;
    }

    private SimpleObject arbitraryAccumulator(SimpleObject a, SimpleObject b) {
        return new SimpleObject(a.getNumber() + b.getNumber(), a.getText() + b.getText());
    }

    public SimpleObject runStreamForArray(SimpleObject[] simpleObjects) {
        return Arrays.stream(simpleObjects)
                .filter(simpleObject -> arbitraryFilter(simpleObject))
                .reduce(this::arbitraryAccumulator)
                .orElse(null);
    }

    public SimpleObject runImperativeForArray(SimpleObject[] simpleObjects) {
        SimpleObject result = new SimpleObject(0, "");
        for (int i = 0; i < simpleObjects.length; i++) {
            SimpleObject simpleObject = simpleObjects[i];
            if (arbitraryFilter(simpleObject)) {
                result = arbitraryAccumulator(result, simpleObject);
            }
        }
        return result;
    }

    public SimpleObject runStreamForList(List<SimpleObject> simpleObjectList) {
        return simpleObjectList.stream()
                .filter(simpleObject -> arbitraryFilter(simpleObject))
                .reduce(this::arbitraryAccumulator)
                .orElse(null);
    }

    public SimpleObject runImperativeForList(List<SimpleObject> simpleObjects) {
        SimpleObject result = new SimpleObject(0, "");
        for (SimpleObject simpleObject : simpleObjects) {
            if (arbitraryFilter(simpleObject)) {
                result = arbitraryAccumulator(result, simpleObject);
            }
        }
        return result;
    }
}
