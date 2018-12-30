package e08;

public class Derived extends Base {
    public Derived(){
        super(5);
        System.out.println("Derived");
    }
    public Derived(int number) {
        super(number);
        System.out.println("Derived "+ number);
    }
}
