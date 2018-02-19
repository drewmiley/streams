package life.drewmiley.examples.single;

import life.drewmiley.examples.StreamTester;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AnyMatchTest extends StreamTester {

    private AnyMatch anyMatch;

    public AnyMatchTest() {
        super();
        anyMatch = new AnyMatch();
    }

    @Test
    public void arrayReturnsEqual() {
        boolean stream = anyMatch.runStreamForArray(objectGenerator.generateSimpleObjectArray());
        boolean imperative = anyMatch.runImperativeForArray(objectGenerator.generateSimpleObjectArray());
        assertTrue(stream == imperative);
    }

    @Test
    public void listReturnsEqual() {
        boolean stream = anyMatch.runStreamForList(objectGenerator.generateSimpleObjectList());
        boolean imperative = anyMatch.runImperativeForList(objectGenerator.generateSimpleObjectList());
        assertTrue(stream == imperative);
    }
}
