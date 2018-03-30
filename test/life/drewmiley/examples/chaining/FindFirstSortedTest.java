package life.drewmiley.examples.chaining;

import life.drewmiley.examples.StreamTester;
import life.drewmiley.helper.SimpleObject;
import org.junit.Test;

import java.util.List;

public class FindFirstSortedTest extends StreamTester {

    private FindFirstSorted findFirstSorted;

    public FindFirstSortedTest() {
        super();
        findFirstSorted = new FindFirstSorted();
    }

    @Test
    public void arrayReturnsEqual() {
        SimpleObject[] stream = findFirstSorted.runStreamForArray(objectGenerator.generateComplexObjectArray());
        SimpleObject[] imperative = findFirstSorted.runImperativeForArray(objectGenerator.generateComplexObjectArray());
        testArraysEqual(stream, imperative);
    }

    @Test
    public void listReturnsEqual() {
        List<SimpleObject> stream = findFirstSorted.runStreamForList(objectGenerator.generateComplexObjectList());
        List<SimpleObject> imperative = findFirstSorted.runImperativeForList(objectGenerator.generateComplexObjectList());
        testListsEqual(stream, imperative);
    }
}

