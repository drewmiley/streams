package life.drewmiley.examples.single;

import life.drewmiley.examples.StreamTester;
import life.drewmiley.helper.SimpleObject;
import org.junit.Test;

import java.util.List;

public class FlatMapTest extends StreamTester {

    private FlatMap flatMap;

    public FlatMapTest() {
        super();
        flatMap = new FlatMap();
    }

    @Test
    public void arrayReturnsEqual() {
        SimpleObject[] stream = flatMap.runStreamForArray(objectGenerator.generateComplexObjectArray());
        SimpleObject[] imperative = flatMap.runImperativeForArray(objectGenerator.generateComplexObjectArray());
        testArraysEqual(stream, imperative);
    }

    @Test
    public void listReturnsEqual() {
        List<SimpleObject> stream = flatMap.runStreamForList(objectGenerator.generateComplexObjectList());
        List<SimpleObject> imperative = flatMap.runImperativeForList(objectGenerator.generateComplexObjectList());
        testListsEqual(stream, imperative);
    }
}
