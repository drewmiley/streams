package life.drewmiley.examples.chaining;

import life.drewmiley.examples.StreamTester;
import org.junit.Test;

import java.util.List;

public class SortedMapTest extends StreamTester {

    private SortedMap sortedMap;

    public SortedMapTest() {
        super();
        sortedMap = new SortedMap();
    }

    @Test
    public void arrayReturnsEqual() {
        String[] stream = sortedMap.runStreamForArray(objectGenerator.generateSimpleObjectArray());
        String[] imperative = sortedMap.runImperativeForArray(objectGenerator.generateSimpleObjectArray());
        testArraysEqual(stream, imperative);
    }

    @Test
    public void listReturnsEqual() {
        List<String> stream = sortedMap.runStreamForList(objectGenerator.generateSimpleObjectList());
        List<String> imperative = sortedMap.runImperativeForList(objectGenerator.generateSimpleObjectList());
        testStringListsEqual(stream, imperative);
    }
}
