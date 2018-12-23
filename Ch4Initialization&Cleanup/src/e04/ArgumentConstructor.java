package e04;

public class ArgumentConstructor {
    public ArgumentConstructor() {
        System.out.println("no args constructor");
    }

    public ArgumentConstructor(String string) {
        System.out.println("arg constructor");
        System.out.println(string);
    }

    public static void main(String[] args) {
        new ArgumentConstructor();
        new ArgumentConstructor("Overloaded");
    }
}

