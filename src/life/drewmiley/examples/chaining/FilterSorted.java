package life.drewmiley.examples.chaining;

import life.drewmiley.examples.helper.InlineFunctions;
import life.drewmiley.examples.helper.SimpleObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterSorted {

    public SimpleObject[] runStreamForArray(SimpleObject[] simpleObjects) {
        return Arrays.stream(simpleObjects)
                .filter(simpleObject -> InlineFunctions.arbitraryFilter(simpleObject))
                .sorted(InlineFunctions::arbitrarySorter)
                .toArray(SimpleObject[]::new);
    }

    public SimpleObject[] runImperativeForArray(SimpleObject[] simpleObjects) {
        SimpleObject[] result = new SimpleObject[0];
        for (int i = 0; i < simpleObjects.length; i++) {
            SimpleObject simpleObject = simpleObjects[i];
            if (InlineFunctions.arbitraryFilter(simpleObject)) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = simpleObject;
            }
        }
        Arrays.sort(result, InlineFunctions::arbitrarySorter);
        return result;
    }

    public List<SimpleObject> runStreamForList(List<SimpleObject> simpleObjectList) {
        return simpleObjectList.stream()
                .filter(simpleObject -> InlineFunctions.arbitraryFilter(simpleObject))
                .sorted(InlineFunctions::arbitrarySorter)
                .collect(Collectors.toList());
    }

    public List<SimpleObject> runImperativeForList(List<SimpleObject> simpleObjectList) {
        List<SimpleObject> result = new ArrayList<>();
        for (SimpleObject simpleObject : simpleObjectList) {
            if (InlineFunctions.arbitraryFilter(simpleObject)) {
                result.add(simpleObject);
            }
        }
        result.sort(InlineFunctions::arbitrarySorter);
        return result;
    }
}
