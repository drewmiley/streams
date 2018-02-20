package life.drewmiley.examples.impure;

import life.drewmiley.examples.StreamTester;
import life.drewmiley.helper.SimpleObject;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class SideEffectsTest extends StreamTester {

    private SideEffects sideEffects;

    @Test
    public void arrayReturnsEqual() {
        sideEffects = new SideEffects();
        assertTrue(sideEffects.getNumber() == 1);
        SimpleObject[] stream = sideEffects.runStreamForArray(objectGenerator.generateSimpleObjectArray());
        assertTrue(sideEffects.getNumber() == 256);

        sideEffects = new SideEffects();
        assertTrue(sideEffects.getNumber() == 1);
        SimpleObject[] imperative = sideEffects.runImperativeForArray(objectGenerator.generateSimpleObjectArray());
        assertTrue(sideEffects.getNumber() == 256);

        testArraysEqual(stream, imperative);
    }

    @Test
    public void listReturnsEqual() {
        sideEffects = new SideEffects();
        assertTrue(sideEffects.getNumber() == 1);
        List<SimpleObject> stream = sideEffects.runStreamForList(objectGenerator.generateSimpleObjectList());
        assertTrue(sideEffects.getNumber() == 256);

        sideEffects = new SideEffects();
        assertTrue(sideEffects.getNumber() == 1);
        List<SimpleObject> imperative = sideEffects.runImperativeForList(objectGenerator.generateSimpleObjectList());
        assertTrue(sideEffects.getNumber() == 256);

        testListsEqual(stream, imperative);
    }
}
