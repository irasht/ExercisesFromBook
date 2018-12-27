package e05;

public class CheckingAccess {
    public int publicNumb;
    protected int protectedNumb;
    int packageNumb;
    private int privateNumb;

    public void method() {
        System.out.println("public method");
    }

    protected void method3() {
        System.out.println("protected method");
    }

    void method4() {
        System.out.println("package method");
    }

    private void method2() {
        System.out.println("private method");
    }

    public static void main(String args[]) {
        CheckingAccess checkingAccess = new CheckingAccess();
        checkingAccess.publicNumb = 1;
        checkingAccess.protectedNumb = 2;
        checkingAccess.packageNumb = 3;
        checkingAccess.privateNumb = 4;
        checkingAccess.method();
        checkingAccess.method2();
        checkingAccess.method3();
        checkingAccess.method4();
    }
}
