package life.drewmiley.runners.single;

import life.drewmiley.helper.ObjectGenerator;
import life.drewmiley.helper.SimpleObject;

import java.util.List;

public class Filter {
    public static void run(ObjectGenerator objectGenerator) {
        System.out.println("Running filter example");
        life.drewmiley.examples.single.Filter filter = new life.drewmiley.examples.single.Filter();

        SimpleObject[] simpleObjects = objectGenerator.generateSimpleObjectArray();
        SimpleObject[] filterObjectsStream = filter.runStreamForArray(simpleObjects);
        SimpleObject[] filterObjectsImperative = filter.runImperativeForArray(simpleObjects);
        System.out.println(filterObjectsStream[0].getNumber() + filterObjectsStream[0].getText());
        System.out.println(filterObjectsStream.length);
        System.out.println(filterObjectsImperative[0].getNumber() + filterObjectsImperative[0].getText());
        System.out.println(filterObjectsImperative.length);

        List<SimpleObject> simpleObjectList = objectGenerator.generateSimpleObjectList();
        List<SimpleObject> filterObjectListStream = filter.runStreamForList(simpleObjectList);
        List<SimpleObject> filterObjectListImperative = filter.runImperativeForList(simpleObjectList);
        System.out.println(filterObjectListStream.get(0).getNumber() + filterObjectListStream.get(0).getText());
        System.out.println(filterObjectListStream.size());
        System.out.println(filterObjectListImperative.get(0).getNumber() + filterObjectListImperative.get(0).getText());
        System.out.println(filterObjectListImperative.size());
    }

    public static void main(String[] strings) {

    }
}