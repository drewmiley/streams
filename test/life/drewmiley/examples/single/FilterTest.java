package life.drewmiley.examples.single;

import life.drewmiley.examples.StreamTester;
import life.drewmiley.helper.SimpleObject;
import org.junit.Test;

import java.util.List;

public class FilterTest extends StreamTester {

    private Filter filter;

    public FilterTest() {
        super();
        filter = new Filter();
    }

    @Test
    public void arrayReturnsEqual() {
        SimpleObject[] stream = filter.runStreamForArray(objectGenerator.generateSimpleObjectArray());
        SimpleObject[] imperative = filter.runImperativeForArray(objectGenerator.generateSimpleObjectArray());
        testArraysEqual(stream, imperative);
    }

    @Test
    public void listReturnsEqual() {
        List<SimpleObject> stream = filter.runStreamForList(objectGenerator.generateSimpleObjectList());
        List<SimpleObject> imperative = filter.runImperativeForList(objectGenerator.generateSimpleObjectList());
        testListsEqual(stream, imperative);
    }
}
