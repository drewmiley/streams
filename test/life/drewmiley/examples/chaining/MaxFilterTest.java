package life.drewmiley.examples.chaining;

import life.drewmiley.examples.StreamTester;
import life.drewmiley.helper.SimpleObject;
import org.junit.Test;

import java.util.List;

public class MaxFilterTest extends StreamTester {

    private MaxFilter maxFilter;

    public MaxFilterTest() {
        super();
        maxFilter = new MaxFilter();
    }

    @Test
    public void arrayReturnsEqual() {
        SimpleObject[] stream = maxFilter.runStreamForArray(objectGenerator.generateComplexObjectArray());
        SimpleObject[] imperative = maxFilter.runImperativeForArray(objectGenerator.generateComplexObjectArray());
        testArraysEqual(stream, imperative);
    }

    @Test
    public void listReturnsEqual() {
        List<SimpleObject> stream = maxFilter.runStreamForList(objectGenerator.generateComplexObjectList());
        List<SimpleObject> imperative = maxFilter.runImperativeForList(objectGenerator.generateComplexObjectList());
        testListsEqual(stream, imperative);
    }
}

