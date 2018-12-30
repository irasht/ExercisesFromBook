package e04;

public class CClass extends BClass{
    public CClass() {
        super();
        System.out.println("C class constructor");
    }
    public static void main(String[] args) {
        new CClass();
    }
}
