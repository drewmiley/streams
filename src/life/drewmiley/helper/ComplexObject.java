package life.drewmiley.helper;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ComplexObject extends SimpleObject {

    private SimpleObject simpleObject;
    private List<SimpleObject> simpleObjectList;

    public SimpleObject getSimpleObject() {
        return simpleObject;
    }

    public List<SimpleObject> getSimpleObjectList() {
        return simpleObjectList;
    }

    public ComplexObject(int number, String text, SimpleObject simpleObject, List<SimpleObject> simpleObjectList) {
        super(number, text);
        this.simpleObject = simpleObject;
        this.simpleObjectList = simpleObjectList;
    }

    public boolean equals(ComplexObject complexObject) {
        return this.getNumber() == complexObject.getNumber() &&
                this.getText().equals(complexObject.getText()) &&
                this.getSimpleObject().equals(complexObject.getSimpleObject()) &&
                IntStream.range(1, this.getSimpleObjectList().size())
                        .allMatch(i -> this.getSimpleObjectList().get(i).equals(complexObject.getSimpleObjectList().get(i)));
    }
}
