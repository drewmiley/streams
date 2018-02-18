package life.drewmiley.runners.impure;

import life.drewmiley.helper.ObjectGenerator;
import life.drewmiley.helper.SimpleObject;

import java.util.List;

public class SideEffects {
    public static void run(ObjectGenerator objectGenerator) {
        System.out.println("Running example of side effects");
        life.drewmiley.examples.impure.SideEffects sideEffects = new life.drewmiley.examples.impure.SideEffects();

        SimpleObject[] simpleObjects = objectGenerator.generateSimpleObjectArray();
        SimpleObject[] sideEffectsObjectsStream = sideEffects.runStreamForArray(simpleObjects);
        SimpleObject[] sideEffectsObjectsImperative = sideEffects.runImperativeForArray(simpleObjects);

        List<SimpleObject> simpleObjectList = objectGenerator.generateSimpleObjectList();
        List<SimpleObject> sideEffectsObjectListStream = sideEffects.runStreamForList(simpleObjectList);
        List<SimpleObject> sideEffectsObjectListImperative = sideEffects.runImperativeForList(simpleObjectList);
    }

    public static void main(String[] strings) {

    }
}