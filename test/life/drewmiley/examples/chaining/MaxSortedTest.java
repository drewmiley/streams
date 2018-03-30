package life.drewmiley.examples.chaining;

import life.drewmiley.examples.StreamTester;
import life.drewmiley.helper.SimpleObject;
import org.junit.Test;

import java.util.List;

public class MaxSortedTest extends StreamTester {

    private MaxSorted maxSorted;

    public MaxSortedTest() {
        super();
        maxSorted = new MaxSorted();
    }

    @Test
    public void arrayReturnsEqual() {
        SimpleObject[] stream = maxSorted.runStreamForArray(objectGenerator.generateComplexObjectArray());
        SimpleObject[] imperative = maxSorted.runImperativeForArray(objectGenerator.generateComplexObjectArray());
        testArraysEqual(stream, imperative);
    }

    @Test
    public void listReturnsEqual() {
        List<SimpleObject> stream = maxSorted.runStreamForList(objectGenerator.generateComplexObjectList());
        List<SimpleObject> imperative = maxSorted.runImperativeForList(objectGenerator.generateComplexObjectList());
        testListsEqual(stream, imperative);
    }
}

