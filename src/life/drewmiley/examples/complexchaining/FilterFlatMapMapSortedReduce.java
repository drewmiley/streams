package life.drewmiley.examples.complexchaining;

import life.drewmiley.examples.helper.ComplexObject;
import life.drewmiley.examples.helper.InlineFunctions;
import life.drewmiley.examples.helper.SimpleObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterFlatMapMapSortedReduce {

    public String runStreamForArray(ComplexObject[] complexObjects) {
        return Arrays.stream(complexObjects)
                .filter(complexObject -> InlineFunctions.arbitraryFilter(complexObject))
                .flatMap(complexObject -> complexObject.getSimpleObjectList().stream())
                .map(simpleObject -> InlineFunctions.arbitraryMapper(simpleObject))
                .sorted(InlineFunctions::arbitraryStringSorter)
                .reduce((a, b) -> a + b)
                .orElse(null);
    }

    public String runImperatveForArray(ComplexObject[] complexObjects) {
        String[] array = new String[0];
        for (int i = 0; i < complexObjects.length; i++) {
            int currentArrayLength = array.length;
            ComplexObject complexObject = complexObjects[i];
            if (InlineFunctions.arbitraryFilter(complexObject)) {
                List<SimpleObject> simpleObjectsList = complexObject.getSimpleObjectList();
                array = Arrays.copyOf(array, currentArrayLength + simpleObjectsList.size());
                int index = 0;
                for (SimpleObject simpleObject : simpleObjectsList) {
                    array[currentArrayLength + index] = InlineFunctions.arbitraryMapper(simpleObject);
                    index++;
                }
            }
        }
        Arrays.sort(array, InlineFunctions::arbitraryStringSorter);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            result.append(array[i]);
        }
        return result.toString();
    }

    public String runStreamForList(List<ComplexObject> complexObjectList) {
        return complexObjectList.stream()
                .filter(complexObject -> InlineFunctions.arbitraryFilter(complexObject))
                .flatMap(complexObject -> complexObject.getSimpleObjectList().stream())
                .map(simpleObject -> InlineFunctions.arbitraryMapper(simpleObject))
                .sorted(InlineFunctions::arbitraryStringSorter)
                .reduce((a, b) -> a + b)
                .orElse(null);
    }

    public String runImperativeForList(List<ComplexObject> complexObjectList) {
        List<String> list = new ArrayList<>();
        for (ComplexObject complexObject : complexObjectList) {
            if (InlineFunctions.arbitraryFilter(complexObject)) {
                List<SimpleObject> simpleObjectList = complexObject.getSimpleObjectList();
                for (SimpleObject simpleObject: simpleObjectList) {
                    list.add(InlineFunctions.arbitraryMapper(simpleObject));
                }
            }
        }
        list.sort(InlineFunctions::arbitraryStringSorter);
        StringBuilder result = new StringBuilder();
        for (String string : list) {
            result.append(string);
        }
        return result.toString();
    }
}
