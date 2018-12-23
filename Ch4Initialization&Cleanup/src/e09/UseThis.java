package e09;

public class UseThis {
    public UseThis(String string) {
        System.out.println("1const = " + string);
    }

    public UseThis(int number) {
        this("2const = " + number);
    }

    public static void main(String args[]) {
        new UseThis("String");
        new UseThis(2);
    }
}
