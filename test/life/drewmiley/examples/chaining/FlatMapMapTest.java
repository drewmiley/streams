package life.drewmiley.examples.chaining;

import life.drewmiley.examples.StreamTester;
import org.junit.Test;

import java.util.List;

public class FlatMapMapTest extends StreamTester {

    private FlatMapMap flatMapMap;

    public FlatMapMapTest() {
        super();
        flatMapMap = new FlatMapMap();
    }

    @Test
    public void arrayReturnsEqual() {
        String[] stream = flatMapMap.runStreamForArray(objectGenerator.generateComplexObjectArray());
        String[] imperative = flatMapMap.runImperativeForArray(objectGenerator.generateComplexObjectArray());
        testArraysEqual(stream, imperative);
    }

    @Test
    public void listReturnsEqual() {
        List<String> stream = flatMapMap.runStreamForList(objectGenerator.generateComplexObjectList());
        List<String> imperative = flatMapMap.runImperativeForList(objectGenerator.generateComplexObjectList());
        testStringListsEqual(stream, imperative);
    }
}
