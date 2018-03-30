package life.drewmiley.examples.chaining;

import life.drewmiley.examples.StreamTester;
import life.drewmiley.helper.SimpleObject;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MaxReduceTest extends StreamTester {

    private MaxReduce maxReduce;

    public MaxReduceTest() {
        super();
        maxReduce = new MaxReduce();
    }

    @Test
    public void arrayReturnsEqual() {
        SimpleObject stream = maxReduce.runStreamForArray(objectGenerator.generateComplexObjectArray());
        SimpleObject imperative = maxReduce.runImperativeForArray(objectGenerator.generateComplexObjectArray());
        assertTrue(stream.equals(imperative));
    }

    @Test
    public void listReturnsEqual() {
        SimpleObject stream = maxReduce.runStreamForList(objectGenerator.generateComplexObjectList());
        SimpleObject imperative = maxReduce.runImperativeForList(objectGenerator.generateComplexObjectList());
        assertTrue(stream.equals(imperative));
    }
}

