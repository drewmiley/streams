package life.drewmiley.examples.chaining;

import life.drewmiley.examples.StreamTester;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MapReduceTest extends StreamTester {

    private MapReduce mapReduce;

    public MapReduceTest() {
        super();
        mapReduce = new MapReduce();
    }

    @Test
    public void arrayReturnsEqual() {
        String stream = mapReduce.runStreamForArray(objectGenerator.generateSimpleObjectArray());
        String imperative = mapReduce.runImperativeForArray(objectGenerator.generateSimpleObjectArray());
        assertTrue(stream.equals(imperative));
    }

    @Test
    public void listReturnsEqual() {
        String stream = mapReduce.runStreamForList(objectGenerator.generateSimpleObjectList());
        String imperative = mapReduce.runImperativeForList(objectGenerator.generateSimpleObjectList());
        assertTrue(stream.equals(imperative));
    }
}
