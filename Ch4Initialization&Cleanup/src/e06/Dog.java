package e06;

public class Dog {
    public void bark(int numb1, double numb) {
        System.out.println("int = " + numb1 + ", " + "double = " + numb);
    }

    public void bark(double numb, int numb1) {
        System.out.println("double = " + numb + ", " + "int = " + numb1);
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark(1, 5.5);
        dog.bark(5.5, 1);
    }
}