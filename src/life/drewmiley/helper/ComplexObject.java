package life.drewmiley.helper;

import java.util.List;

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
}
