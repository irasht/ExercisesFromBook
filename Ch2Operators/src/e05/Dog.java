package e05;

public class Dog {
    private String name;
    private String says;

    public Dog(String name, String says) {
        this.name = name;
        this.says = says;
    }

    @Override
    public String toString() {
        return name + " says: " + says;
    }
}
