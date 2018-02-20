package life.drewmiley.examples.chaining;

import life.drewmiley.examples.StreamTester;
import life.drewmiley.helper.SimpleObject;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FilterReduceTest extends StreamTester {

    private FilterReduce filterReduce;

    public FilterReduceTest() {
        super();
        filterReduce = new FilterReduce();
    }

    @Test
    public void arrayReturnsEqual() {
        SimpleObject stream = filterReduce.runStreamForArray(objectGenerator.generateSimpleObjectArray());
        SimpleObject imperative = filterReduce.runImperativeForArray(objectGenerator.generateSimpleObjectArray());
        assertTrue(stream.equals(imperative));
    }

    @Test
    public void listReturnsEqual() {
        SimpleObject stream = filterReduce.runStreamForList(objectGenerator.generateSimpleObjectList());
        SimpleObject imperative = filterReduce.runImperativeForList(objectGenerator.generateSimpleObjectList());
        assertTrue(stream.equals(imperative));
    }
}
