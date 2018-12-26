package e14;

public class StaticString {
    static String string = "Initialized at definition";
    static String string1;

    static {
        string1 = "Initialized in static block";
    }

    public static void main(String[] args) {
        System.out.println("string: " + string);
        System.out.println("string1: " + string1);
    }
}
