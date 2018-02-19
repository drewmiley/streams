package life.drewmiley.examples.single;

import life.drewmiley.examples.StreamTester;
import org.junit.Test;

import java.util.List;

public class MapTest extends StreamTester {

    private Map map;

    public MapTest() {
        super();
        map = new Map();
    }

    @Test
    public void arrayReturnsEqual() {
        String[] stream = map.runStreamForArray(objectGenerator.generateSimpleObjectArray());
        String[] imperative = map.runImperativeForArray(objectGenerator.generateSimpleObjectArray());
        testArraysEqual(stream, imperative);
    }

    @Test
    public void listReturnsEqual() {
        List<String> stream = map.runStreamForList(objectGenerator.generateSimpleObjectList());
        List<String> imperative = map.runImperativeForList(objectGenerator.generateSimpleObjectList());
        testListsEqual(stream, imperative);
    }
}
