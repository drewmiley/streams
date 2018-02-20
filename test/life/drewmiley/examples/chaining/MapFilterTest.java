package life.drewmiley.examples.chaining;

import life.drewmiley.examples.StreamTester;
import org.junit.Test;

import java.util.List;

public class MapFilterTest extends StreamTester {

    private MapFilter mapFilter;

    public MapFilterTest() {
        super();
        mapFilter = new MapFilter();
    }

    @Test
    public void arrayReturnsEqual() {
        String[] stream = mapFilter.runStreamForArray(objectGenerator.generateSimpleObjectArray());
        String[] imperative = mapFilter.runImperativeForArray(objectGenerator.generateSimpleObjectArray());
        testArraysEqual(stream, imperative);
    }

    @Test
    public void listReturnsEqual() {
        List<String> stream = mapFilter.runStreamForList(objectGenerator.generateSimpleObjectList());
        List<String> imperative = mapFilter.runImperativeForList(objectGenerator.generateSimpleObjectList());
        testStringListsEqual(stream, imperative);
    }
}
