package life.drewmiley.examples.chaining;

import life.drewmiley.examples.StreamTester;
import life.drewmiley.helper.SimpleObject;
import org.junit.Test;

import java.util.List;

public class FilterSortedTest extends StreamTester {

    private FilterSorted filterSorted;

    public FilterSortedTest() {
        super();
        filterSorted = new FilterSorted();
    }

    @Test
    public void arrayReturnsEqual() {
        SimpleObject[] stream = filterSorted.runStreamForArray(objectGenerator.generateSimpleObjectArray());
        SimpleObject[] imperative = filterSorted.runImperativeForArray(objectGenerator.generateSimpleObjectArray());
        testArraysEqual(stream, imperative);
    }

    @Test
    public void listReturnsEqual() {
        List<SimpleObject> stream = filterSorted.runStreamForList(objectGenerator.generateSimpleObjectList());
        List<SimpleObject> imperative = filterSorted.runImperativeForList(objectGenerator.generateSimpleObjectList());
        testListsEqual(stream, imperative);
    }
}
