package life.drewmiley.helper;

public class SimpleObject {

    private int number;
    private String text;

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

    public SimpleObject(int number, String text) {
        this.setNumber(number);
        this.setText(text);
    }

    public boolean equals(SimpleObject simpleObject) {
        return this.getNumber() == simpleObject.getNumber() &&
                this.getText().equals(simpleObject.getText());
    }
}
