package life.drewmiley.examples.chaining;

import life.drewmiley.examples.StreamTester;
import life.drewmiley.helper.SimpleObject;
import org.junit.Test;

import java.util.List;

public class SortedFlatMapTest extends StreamTester {

    private SortedFlatMap sortedFlatMap;

    public SortedFlatMapTest() {
        super();
        sortedFlatMap = new SortedFlatMap();
    }

    @Test
    public void arrayReturnsEqual() {
        SimpleObject[] stream = sortedFlatMap.runStreamForArray(objectGenerator.generateComplexObjectArray());
        SimpleObject[] imperative = sortedFlatMap.runImperativeForArray(objectGenerator.generateComplexObjectArray());
        testArraysEqual(stream, imperative);
    }

    @Test
    public void listReturnsEqual() {
        List<SimpleObject> stream = sortedFlatMap.runStreamForList(objectGenerator.generateComplexObjectList());
        List<SimpleObject> imperative = sortedFlatMap.runImperativeForList(objectGenerator.generateComplexObjectList());
        testListsEqual(stream, imperative);
    }
}

