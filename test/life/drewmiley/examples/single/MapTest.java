package life.drewmiley.examples.single;

import life.drewmiley.helper.ObjectGenerator;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.stream.IntStream;

import static org.junit.Assert.assertTrue;

public class MapTest {

    private Map map;
    private ObjectGenerator objectGenerator;

    @Before
    public void before() {
        map = new Map();
        objectGenerator = new ObjectGenerator();
    }

    @Test
    public void arrayReturnsEqual() {
        String[] stream = map.runStreamForArray(objectGenerator.generateSimpleObjectArray());
        String[] imperative = map.runImperativeForArray(objectGenerator.generateSimpleObjectArray());
        assertTrue(stream.length == imperative.length);
        IntStream.range(1, stream.length)
                .forEach(i -> assertTrue(stream[i].equals(imperative[i])));
    }

    @Test
    public void listReturnsEqual() {
        List<String> stream = map.runStreamForList(objectGenerator.generateSimpleObjectList());
        List<String> imperative = map.runImperativeForList(objectGenerator.generateSimpleObjectList());
        assertTrue(stream.size() == imperative.size());
        IntStream.range(1, stream.size())
                .forEach(i -> assertTrue(stream.get(i).equals(imperative.get(i))));
    }
}
