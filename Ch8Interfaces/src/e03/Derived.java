package e03;

public class Derived extends Base {
   private int numb = 10;

    @Override
    public void print() {
        System.out.println("numb = " + numb);
    }
}
