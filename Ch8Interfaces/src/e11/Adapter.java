package e11;

public class Adapter implements Processor {
    public String name() {
        return App.class.getSimpleName();
    }

    public String process(Object input) {
        return App.swap((String) input);
    }
}