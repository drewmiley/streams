package life.drewmiley.examples.helper;

import java.util.List;

public class ComplexObject {

    private int number;
    private String text;
    private SimpleObject simpleObject;
    private List<SimpleObject> simpleObjectList;

    public int getNumber() {
        return number;
    }

    public String getText() {
        return text;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setText(String text) {
        this.text = text;
    }

    public SimpleObject getSimpleObject() {
        return simpleObject;
    }

    public List<SimpleObject> getSimpleObjectList() {
        return simpleObjectList;
    }

    public ComplexObject(int number, String text, SimpleObject simpleObject, List<SimpleObject> simpleObjectList) {
        this.setNumber(number);
        this.setText(text);
        this.simpleObject = simpleObject;
        this.simpleObjectList = simpleObjectList;
    }
}
