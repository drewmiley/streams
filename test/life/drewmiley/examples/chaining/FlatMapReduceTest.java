package life.drewmiley.examples.chaining;

import life.drewmiley.examples.StreamTester;
import life.drewmiley.helper.SimpleObject;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FlatMapReduceTest extends StreamTester {

    private FlatMapReduce flatMapReduce;

    public FlatMapReduceTest() {
        super();
        flatMapReduce = new FlatMapReduce();
    }

    @Test
    public void arrayReturnsEqual() {
        SimpleObject stream = flatMapReduce.runStreamForArray(objectGenerator.generateComplexObjectArray());
        SimpleObject imperative = flatMapReduce.runImperativeForArray(objectGenerator.generateComplexObjectArray());
        assertTrue(stream.equals(imperative));
    }

    @Test
    public void listReturnsEqual() {
        SimpleObject stream = flatMapReduce.runStreamForList(objectGenerator.generateComplexObjectList());
        SimpleObject imperative = flatMapReduce.runImperativeForList(objectGenerator.generateComplexObjectList());
        assertTrue(stream.equals(imperative));
    }
}
