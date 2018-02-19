package life.drewmiley.examples.single;

import life.drewmiley.examples.StreamTester;
import life.drewmiley.helper.SimpleObject;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MaxTest extends StreamTester {

    private Max max;

    public MaxTest() {
        super();
        max = new Max();
    }

    @Test
    public void arrayReturnsEqual() {
        SimpleObject stream = max.runStreamForArray(objectGenerator.generateSimpleObjectArray());
        SimpleObject imperative = max.runImperativeForArray(objectGenerator.generateSimpleObjectArray());
        assertTrue(stream.equals(imperative));
    }

    @Test
    public void listReturnsEqual() {
        SimpleObject stream = max.runStreamForList(objectGenerator.generateSimpleObjectList());
        SimpleObject imperative = max.runImperativeForList(objectGenerator.generateSimpleObjectList());
        assertTrue(stream.equals(imperative));
    }
}
