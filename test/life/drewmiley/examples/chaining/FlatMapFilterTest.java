package life.drewmiley.examples.chaining;

import life.drewmiley.examples.StreamTester;
import life.drewmiley.helper.SimpleObject;
import org.junit.Test;

import java.util.List;

public class FlatMapFilterTest extends StreamTester {

    private FlatMapFilter flatMapFilter;

    public FlatMapFilterTest() {
        super();
        flatMapFilter = new FlatMapFilter();
    }

    @Test
    public void arrayReturnsEqual() {
        SimpleObject[] stream = flatMapFilter.runStreamForArray(objectGenerator.generateComplexObjectArray());
        SimpleObject[] imperative = flatMapFilter.runImperativeForArray(objectGenerator.generateComplexObjectArray());
        testArraysEqual(stream, imperative);
    }

    @Test
    public void listReturnsEqual() {
        List<SimpleObject> stream = flatMapFilter.runStreamForList(objectGenerator.generateComplexObjectList());
        List<SimpleObject> imperative = flatMapFilter.runImperativeForList(objectGenerator.generateComplexObjectList());
        testListsEqual(stream, imperative);
    }
}
