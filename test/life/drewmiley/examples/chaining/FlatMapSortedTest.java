package life.drewmiley.examples.chaining;

import life.drewmiley.examples.StreamTester;
import life.drewmiley.helper.SimpleObject;
import org.junit.Test;

import java.util.List;

public class FlatMapSortedTest extends StreamTester {

    private FlatMapSorted flatMapSorted;

    public FlatMapSortedTest() {
        super();
        flatMapSorted = new FlatMapSorted();
    }

    @Test
    public void arrayReturnsEqual() {
        SimpleObject[] stream = flatMapSorted.runStreamForArray(objectGenerator.generateComplexObjectArray());
        SimpleObject[] imperative = flatMapSorted.runImperativeForArray(objectGenerator.generateComplexObjectArray());
        testArraysEqual(stream, imperative);
    }

    @Test
    public void listReturnsEqual() {
        List<SimpleObject> stream = flatMapSorted.runStreamForList(objectGenerator.generateComplexObjectList());
        List<SimpleObject> imperative = flatMapSorted.runImperativeForList(objectGenerator.generateComplexObjectList());
        testListsEqual(stream, imperative);
    }
}
