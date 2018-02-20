package life.drewmiley.examples.complexchaining;

import life.drewmiley.examples.StreamTester;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SortedMapFilterReduceTest extends StreamTester {

    private SortedMapFilterReduce sortedMapFilterReduce;

    public SortedMapFilterReduceTest() {
        super();
        sortedMapFilterReduce = new SortedMapFilterReduce();
    }

    @Test
    public void arrayReturnsEqual() {
        String stream = sortedMapFilterReduce.runStreamForArray(objectGenerator.generateSimpleObjectArray());
        String imperative = sortedMapFilterReduce.runImperativeForArray(objectGenerator.generateSimpleObjectArray());
        assertTrue(stream.equals(imperative));
    }

    @Test
    public void listReturnsEqual() {
        String stream = sortedMapFilterReduce.runStreamForList(objectGenerator.generateSimpleObjectList());
        String imperative = sortedMapFilterReduce.runImperativeForList(objectGenerator.generateSimpleObjectList());
        assertTrue(stream.equals(imperative));
    }
}
