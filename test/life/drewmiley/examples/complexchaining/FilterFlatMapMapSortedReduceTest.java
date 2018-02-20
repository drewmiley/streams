package life.drewmiley.examples.complexchaining;

import life.drewmiley.examples.StreamTester;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FilterFlatMapMapSortedReduceTest extends StreamTester {

    private FilterFlatMapMapSortedReduce filterFlatMapMapSortedReduce;

    public FilterFlatMapMapSortedReduceTest() {
        super();
        filterFlatMapMapSortedReduce = new FilterFlatMapMapSortedReduce();
    }

    @Test
    public void arrayReturnsEqual() {
        String stream = filterFlatMapMapSortedReduce.runStreamForArray(objectGenerator.generateComplexObjectArray());
        String imperative = filterFlatMapMapSortedReduce.runImperativeForArray(objectGenerator.generateComplexObjectArray());
        assertTrue(stream.equals(imperative));
    }

    @Test
    public void listReturnsEqual() {
        String stream = filterFlatMapMapSortedReduce.runStreamForList(objectGenerator.generateComplexObjectList());
        String imperative = filterFlatMapMapSortedReduce.runImperativeForList(objectGenerator.generateComplexObjectList());
        assertTrue(stream.equals(imperative));
    }
}
