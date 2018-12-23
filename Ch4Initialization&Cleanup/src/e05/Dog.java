package e05;

public class Dog {
    public void bark() {
        System.out.println("Default bark!");
    }

    public void bark(int i) {
        System.out.println("int bark = howl");
    }

    public void bark(String string) {
        System.out.println("String bark = " + string);
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.bark(1);
        dog.bark("hav");
    }
}
