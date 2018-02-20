package life.drewmiley.examples.single;

import life.drewmiley.examples.StreamTester;
import life.drewmiley.helper.SimpleObject;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ReduceTest extends StreamTester {

    private Reduce reduce;

    public ReduceTest() {
        super();
        reduce = new Reduce();
    }

    @Test
    public void arrayReturnsEqual() {
        SimpleObject stream = reduce.runStreamForArray(objectGenerator.generateSimpleObjectArray());
        SimpleObject imperative = reduce.runImperativeForArray(objectGenerator.generateSimpleObjectArray());
        assertTrue(stream.equals(imperative));
    }

    @Test
    public void listReturnsEqual() {
        SimpleObject stream = reduce.runStreamForList(objectGenerator.generateSimpleObjectList());
        SimpleObject imperative = reduce.runImperativeForList(objectGenerator.generateSimpleObjectList());
        assertTrue(stream.equals(imperative));
    }
}
