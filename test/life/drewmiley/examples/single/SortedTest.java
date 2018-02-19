package life.drewmiley.examples.single;

import life.drewmiley.examples.StreamTester;
import life.drewmiley.helper.SimpleObject;
import org.junit.Test;

import java.util.List;

public class SortedTest extends StreamTester {

    private Sorted sorted;

    public SortedTest() {
        super();
        sorted = new Sorted();
    }

    @Test
    public void arrayReturnsEqual() {
        SimpleObject[] stream = sorted.runStreamForArray(objectGenerator.generateSimpleObjectArray());
        SimpleObject[] imperative = sorted.runImperativeForArray(objectGenerator.generateSimpleObjectArray());
        testArraysEqual(stream, imperative);
    }

    @Test
    public void listReturnsEqual() {
        List<SimpleObject> stream = sorted.runStreamForList(objectGenerator.generateSimpleObjectList());
        List<SimpleObject> imperative = sorted.runImperativeForList(objectGenerator.generateSimpleObjectList());
        testListsEqual(stream, imperative);
    }
}
