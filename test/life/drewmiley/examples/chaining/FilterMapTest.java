package life.drewmiley.examples.chaining;

import life.drewmiley.examples.StreamTester;
import org.junit.Test;

import java.util.List;

public class FilterMapTest extends StreamTester {

    private FilterMap filterMap;

    public FilterMapTest() {
        super();
        filterMap = new FilterMap();
    }

    @Test
    public void arrayReturnsEqual() {
        String[] stream = filterMap.runStreamForArray(objectGenerator.generateSimpleObjectArray());
        String[] imperative = filterMap.runImperativeForArray(objectGenerator.generateSimpleObjectArray());
        testArraysEqual(stream, imperative);
    }

    @Test
    public void listReturnsEqual() {
        List<String> stream = filterMap.runStreamForList(objectGenerator.generateSimpleObjectList());
        List<String> imperative = filterMap.runImperativeForList(objectGenerator.generateSimpleObjectList());
        testStringListsEqual(stream, imperative);
    }
}
