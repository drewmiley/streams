package life.drewmiley.examples.chaining;

import life.drewmiley.examples.StreamTester;
import org.junit.Test;

import java.util.List;

public class MapSortedTest extends StreamTester {

    private MapSorted mapSorted;

    public MapSortedTest() {
        super();
        mapSorted = new MapSorted();
    }

    @Test
    public void arrayReturnsEqual() {
        String[] stream = mapSorted.runStreamForArray(objectGenerator.generateSimpleObjectArray());
        String[] imperative = mapSorted.runImperativeForArray(objectGenerator.generateSimpleObjectArray());
        testArraysEqual(stream, imperative);
    }

    @Test
    public void listReturnsEqual() {
        List<String> stream = mapSorted.runStreamForList(objectGenerator.generateSimpleObjectList());
        List<String> imperative = mapSorted.runImperativeForList(objectGenerator.generateSimpleObjectList());
        testStringListsEqual(stream, imperative);
    }
}
