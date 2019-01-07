package e15;

public class Main {
    public static void main(String[] args) {
        SecondClass second = new SecondClass();
        FirstClass first = second.get(10);
        first.method();
        first = second.get1(22);
        first.method();
    }
}
