package life.drewmiley.examples.helper;

public class InlineFunctions {

    public static boolean arbitraryFilter(SimpleObject simpleObject) {
        return simpleObject.getNumber() % 2 == 0;
    }

    public static boolean evilFilter(SimpleObject simpleObject) {
        return simpleObject.getNumber() > 1000000;
    }

    public static boolean niceFilter(SimpleObject simpleObject) {
        return simpleObject.getText() != null;
    }

    public void arbitraryFunction(SimpleObject simpleObject) {
        System.out.println(simpleObject.getNumber() + simpleObject.getText());
    }

    public static SimpleObject arbitraryObjectMapper(SimpleObject simpleObject) {
        return new SimpleObject(simpleObject.getNumber() + 10, simpleObject.getText().toUpperCase());
    }

    public static String arbitraryMapper(SimpleObject simpleObject) {
        return (simpleObject.getNumber() + 10) + simpleObject.getText().toUpperCase();
    }

    public static int arbitrarySorter(SimpleObject a, SimpleObject b) {
        return a.getNumber() - b.getNumber();
    }

    public static SimpleObject arbitraryAccumulator(SimpleObject a, SimpleObject b) {
        return new SimpleObject(a.getNumber() + b.getNumber(), a.getText() + b.getText());
    }
}
