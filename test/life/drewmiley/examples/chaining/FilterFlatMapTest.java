package life.drewmiley.examples.chaining;

import life.drewmiley.examples.StreamTester;
import life.drewmiley.helper.SimpleObject;
import org.junit.Test;

import java.util.List;

public class FilterFlatMapTest extends StreamTester {

    private FilterFlatMap filterFlatMap;

    public FilterFlatMapTest() {
        super();
        filterFlatMap = new FilterFlatMap();
    }

    @Test
    public void arrayReturnsEqual() {
        SimpleObject[] stream = filterFlatMap.runStreamForArray(objectGenerator.generateComplexObjectArray());
        SimpleObject[] imperative = filterFlatMap.runImperativeForArray(objectGenerator.generateComplexObjectArray());
        testArraysEqual(stream, imperative);
    }

    @Test
    public void listReturnsEqual() {
        List<SimpleObject> stream = filterFlatMap.runStreamForList(objectGenerator.generateComplexObjectList());
        List<SimpleObject> imperative = filterFlatMap.runImperativeForList(objectGenerator.generateComplexObjectList());
        testListsEqual(stream, imperative);
    }
}

