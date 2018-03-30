package life.drewmiley.examples.chaining;

import life.drewmiley.examples.StreamTester;
import life.drewmiley.helper.SimpleObject;
import org.junit.Test;

import java.util.List;

public class FindFirstFilterTest extends StreamTester {

    private FindFirstFilter findFirstFilter;

    public FindFirstFilterTest() {
        super();
        findFirstFilter = new FindFirstFilter();
    }

    @Test
    public void arrayReturnsEqual() {
        SimpleObject[] stream = findFirstFilter.runStreamForArray(objectGenerator.generateComplexObjectArray());
        SimpleObject[] imperative = findFirstFilter.runImperativeForArray(objectGenerator.generateComplexObjectArray());
        testArraysEqual(stream, imperative);
    }

    @Test
    public void listReturnsEqual() {
        List<SimpleObject> stream = findFirstFilter.runStreamForList(objectGenerator.generateComplexObjectList());
        List<SimpleObject> imperative = findFirstFilter.runImperativeForList(objectGenerator.generateComplexObjectList());
        testListsEqual(stream, imperative);
    }
}

