package life.drewmiley.examples.helper;

import java.util.ArrayList;
import java.util.List;

public class ObjectGenerator {

    public List<SimpleObject> generateSimpleObjectList() {
        List<SimpleObject> list = new ArrayList<>();
        list.add(new SimpleObject(10, "First"));
        list.add(new SimpleObject(3, "Second"));
        list.add(new SimpleObject(-6, "Third"));
        list.add(new SimpleObject(2, "Fourth"));
        list.add(new SimpleObject(8, "Fifth"));
        list.add(new SimpleObject(7, "Sixth"));
        list.add(new SimpleObject(1, "Seventh"));
        list.add(new SimpleObject(0, "Eighth"));
        return list;
    }

    public SimpleObject[] generateSimpleObjectArray() {
        return generateSimpleObjectList().toArray(new SimpleObject[8]);
    }

    public List<SimpleObject> removedSimpleObjectList(int index) {
        List<SimpleObject> list = generateSimpleObjectList();
        list.remove(index);
        return list;
    }

    public List<ComplexObject> generateComplexObjectList() {
        List<ComplexObject> list = new ArrayList<>();
        list.add(new ComplexObject(5, "Delta", new SimpleObject(8, "Red"), removedSimpleObjectList(3)));
        list.add(new ComplexObject(2, "Kappa", new SimpleObject(3, "Orange"), removedSimpleObjectList(6)));
        list.add(new ComplexObject(7, "Mu", new SimpleObject(0, "Yellow"), removedSimpleObjectList(0)));
        list.add(new ComplexObject(8, "Beta", new SimpleObject(-2, "Green"), removedSimpleObjectList(1)));
        list.add(new ComplexObject(10, "Pi", new SimpleObject(12, "Blue"), removedSimpleObjectList(2)));
        list.add(new ComplexObject(-5, "Eta", new SimpleObject(7, "Indigo"), removedSimpleObjectList(4)));
        list.add(new ComplexObject(7, "Xi", new SimpleObject(4, "Violet"), removedSimpleObjectList(5)));
        return list;
    }

    public ComplexObject[] generateComplexObjectArray() {
        return (ComplexObject[]) generateComplexObjectList().toArray(new ComplexObject[7]);
    }
}
