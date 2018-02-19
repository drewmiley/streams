package life.drewmiley.examples;

import life.drewmiley.helper.ObjectGenerator;
import life.drewmiley.helper.SimpleObject;

import java.util.List;
import java.util.stream.IntStream;

import static org.junit.Assert.assertTrue;

public abstract class StreamTester {

    public ObjectGenerator objectGenerator;

    public StreamTester() {
        objectGenerator = new ObjectGenerator();
    }

    public void testArraysEqual(String[] stream, String[] imperative) {
        assertTrue(stream.length == imperative.length);
        IntStream.range(1, stream.length)
                .forEach(i -> assertTrue(stream[i].equals(imperative[i])));
    }

    public void testArraysEqual(SimpleObject[] stream, SimpleObject[] imperative) {
        assertTrue(stream.length == imperative.length);
        IntStream.range(1, stream.length)
                .forEach(i -> assertTrue(stream[i].equals(imperative[i])));
    }

    public void testListsEqual(List stream, List imperative) {
        assertTrue(stream.size() == imperative.size());
        IntStream.range(1, stream.size())
                .forEach(i -> assertTrue(stream.get(i).equals(imperative.get(i))));
    }

    public abstract void arrayReturnsEqual();

    public abstract void listReturnsEqual();
}
