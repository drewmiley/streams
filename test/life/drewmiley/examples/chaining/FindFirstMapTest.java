package life.drewmiley.examples.chaining;

import life.drewmiley.examples.StreamTester;
import org.junit.Test;

import java.util.List;

public class FindFirstMapTest extends StreamTester {

    private FindFirstMap findFirstMap;

    public FindFirstMapTest() {
        super();
        findFirstMap = new FindFirstMap();
    }

    @Test
    public void arrayReturnsEqual() {
        String[] stream = findFirstMap.runStreamForArray(objectGenerator.generateComplexObjectArray());
        String[] imperative = findFirstMap.runImperativeForArray(objectGenerator.generateComplexObjectArray());
        testArraysEqual(stream, imperative);
    }

    @Test
    public void listReturnsEqual() {
        List<String> stream = findFirstMap.runStreamForList(objectGenerator.generateComplexObjectList());
        List<String> imperative = findFirstMap.runImperativeForList(objectGenerator.generateComplexObjectList());
        testStringListsEqual(stream, imperative);
    }
}

