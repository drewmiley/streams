package life.drewmiley.examples.helper;

public abstract class ExampleRunner {

    public ObjectGenerator objectGenerator;

    public ExampleRunner() {
        this.objectGenerator = new ObjectGenerator();
    }

    public abstract void run();
}
