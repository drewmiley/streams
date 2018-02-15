package life.drewmiley.examples.chaining;

import life.drewmiley.examples.helper.InlineFunctions;
import life.drewmiley.examples.helper.SimpleObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MapSorted {

    public String[] runStreamForArray(SimpleObject[] simpleObjects) {
        return Arrays.stream(simpleObjects)
                .map(simpleObject -> InlineFunctions.arbitraryMapper(simpleObject))
                .sorted(InlineFunctions::arbitraryStringSorter)
                .toArray(String[]::new);
    }

    public String[] runImperativeForArray(SimpleObject[] simpleObjects) {
        String[] result = new String[simpleObjects.length];
        for (int i = 0; i < simpleObjects.length; i++) {
            SimpleObject simpleObject = simpleObjects[i];
            result[i] = InlineFunctions.arbitraryMapper(simpleObject);
        }
        Arrays.sort(result, InlineFunctions::arbitraryStringSorter);
        return result;
    }

    public List<String> runStreamForList(List<SimpleObject> simpleObjectList) {
        return simpleObjectList.stream()
                .map(simpleObject -> InlineFunctions.arbitraryMapper(simpleObject))
                .sorted(InlineFunctions::arbitraryStringSorter)
                .collect(Collectors.toList());
    }

    public List<String> runImperativeForList(List<SimpleObject> simpleObjectList) {
        List<String> result = new ArrayList<>();
        for (SimpleObject simpleObject : simpleObjectList) {
            result.add(InlineFunctions.arbitraryMapper(simpleObject));
        }
        result.sort(InlineFunctions::arbitraryStringSorter);
        return result;
    }
}
