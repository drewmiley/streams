package life.drewmiley.examples.single;

import life.drewmiley.examples.StreamTester;
import life.drewmiley.helper.SimpleObject;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FindFirstTest extends StreamTester {

    private FindFirst findFirst;

    public FindFirstTest() {
        super();
        findFirst = new FindFirst();
    }

    @Test
    public void arrayReturnsEqual() {
        SimpleObject stream = findFirst.runStreamForArray(objectGenerator.generateSimpleObjectArray());
        SimpleObject imperative = findFirst.runImperativeForArray(objectGenerator.generateSimpleObjectArray());
        assertTrue(stream.equals(imperative));
    }

    @Test
    public void listReturnsEqual() {
        SimpleObject stream = findFirst.runStreamForList(objectGenerator.generateSimpleObjectList());
        SimpleObject imperative = findFirst.runImperativeForList(objectGenerator.generateSimpleObjectList());
        assertTrue(stream.equals(imperative));
    }
}
