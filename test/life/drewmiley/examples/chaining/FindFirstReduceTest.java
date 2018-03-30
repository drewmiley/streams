package life.drewmiley.examples.chaining;

import life.drewmiley.examples.StreamTester;
import life.drewmiley.helper.SimpleObject;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class FindFirstReduceTest extends StreamTester {

    private FindFirstReduce findFirstReduce;

    public FindFirstReduceTest() {
        super();
        findFirstReduce = new FindFirstReduce();
    }

    @Test
    public void arrayReturnsEqual() {
        SimpleObject stream = findFirstReduce.runStreamForArray(objectGenerator.generateComplexObjectArray());
        SimpleObject imperative = findFirstReduce.runImperativeForArray(objectGenerator.generateComplexObjectArray());
        assertTrue(stream.equals(imperative));
    }

    @Test
    public void listReturnsEqual() {
        SimpleObject stream = findFirstReduce.runStreamForList(objectGenerator.generateComplexObjectList());
        SimpleObject imperative = findFirstReduce.runImperativeForList(objectGenerator.generateComplexObjectList());
        assertTrue(stream.equals(imperative));
    }
}

