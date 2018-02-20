package life.drewmiley.examples.chaining;

import life.drewmiley.examples.StreamTester;
import life.drewmiley.helper.SimpleObject;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SortedReduceTest extends StreamTester {

    private SortedReduce sortedReduce;

    public SortedReduceTest() {
        super();
        sortedReduce = new SortedReduce();
    }

    @Test
    public void arrayReturnsEqual() {
        SimpleObject stream = sortedReduce.runStreamForArray(objectGenerator.generateSimpleObjectArray());
        SimpleObject imperative = sortedReduce.runImperativeForArray(objectGenerator.generateSimpleObjectArray());
        assertTrue(stream.equals(imperative));
    }

    @Test
    public void listReturnsEqual() {
        SimpleObject stream = sortedReduce.runStreamForList(objectGenerator.generateSimpleObjectList());
        SimpleObject imperative = sortedReduce.runImperativeForList(objectGenerator.generateSimpleObjectList());
        assertTrue(stream.equals(imperative));
    }
}
