package life.drewmiley.examples.single;

import life.drewmiley.examples.StreamTester;
import life.drewmiley.helper.SimpleObject;
import org.junit.Test;

import java.util.List;

public class ForEachTest extends StreamTester {

    private ForEach forEach;

    public ForEachTest() {
        super();
        forEach = new ForEach();
    }

    @Test
    public void arrayReturnsEqual() {
        SimpleObject[] stream = forEach.runStreamForArray(objectGenerator.generateSimpleObjectArray());
        SimpleObject[] imperative = forEach.runImperativeForArray(objectGenerator.generateSimpleObjectArray());
        testArraysEqual(stream, imperative);
    }

    @Test
    public void listReturnsEqual() {
        List<SimpleObject> stream = forEach.runStreamForList(objectGenerator.generateSimpleObjectList());
        List<SimpleObject> imperative = forEach.runImperativeForList(objectGenerator.generateSimpleObjectList());
        testListsEqual(stream, imperative);
    }
}
