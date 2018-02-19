package life.drewmiley.examples.single;

import life.drewmiley.examples.StreamTester;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AllMatchTest extends StreamTester {

    private AllMatch allMatch;

    public AllMatchTest() {
        super();
        allMatch = new AllMatch();
    }

    @Test
    public void arrayReturnsEqual() {
        boolean stream = allMatch.runStreamForArray(objectGenerator.generateSimpleObjectArray());
        boolean imperative = allMatch.runImperativeForArray(objectGenerator.generateSimpleObjectArray());
        assertTrue(stream == imperative);
    }

    @Test
    public void listReturnsEqual() {
        boolean stream = allMatch.runStreamForList(objectGenerator.generateSimpleObjectList());
        boolean imperative = allMatch.runImperativeForList(objectGenerator.generateSimpleObjectList());
        assertTrue(stream == imperative);
    }
}
