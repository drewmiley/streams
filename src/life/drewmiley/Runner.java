package life.drewmiley;

import life.drewmiley.objects.ObjectGenerator;

public abstract class Runner {

    ObjectGenerator objectGenerator;

    public Runner() {
        this.objectGenerator = new ObjectGenerator();
    }

    public abstract void run();
}
