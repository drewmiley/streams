package life.drewmiley.examples.chaining;

import life.drewmiley.examples.StreamTester;
import org.junit.Test;

import java.util.List;

public class MaxMapTest extends StreamTester {

    private MaxMap maxMap;

    public MaxMapTest() {
        super();
        maxMap = new MaxMap();
    }

    @Test
    public void arrayReturnsEqual() {
        String[] stream = maxMap.runStreamForArray(objectGenerator.generateComplexObjectArray());
        String[] imperative = maxMap.runImperativeForArray(objectGenerator.generateComplexObjectArray());
        testArraysEqual(stream, imperative);
    }

    @Test
    public void listReturnsEqual() {
        List<String> stream = maxMap.runStreamForList(objectGenerator.generateComplexObjectList());
        List<String> imperative = maxMap.runImperativeForList(objectGenerator.generateComplexObjectList());
        testStringListsEqual(stream, imperative);
    }
}
