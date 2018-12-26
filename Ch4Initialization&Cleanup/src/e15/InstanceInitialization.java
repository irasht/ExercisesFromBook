package e15;

public class InstanceInitialization {
    String string;

    {
        string = "string";
    }

    public InstanceInitialization() {
        System.out.println("Constructor with no args: " + string);
    }

    public InstanceInitialization(int num) {
        System.out.println("int constructor: " + string);
    }

    public static void main(String[] args) {
        new InstanceInitialization();
        new InstanceInitialization(2);
    }
}
