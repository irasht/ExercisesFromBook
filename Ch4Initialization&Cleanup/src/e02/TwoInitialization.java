package e02;

public class TwoInitialization {
    String string = "at definition";
    String string1;

    public TwoInitialization(String string1) {
        this.string1 = string1;
    }

    public static void main(String[] args) {
        TwoInitialization two = new TwoInitialization("at construction");
        System.out.println("two.string: " + two.string);
        System.out.println("two.string1: " + two.string1);
    }
}
