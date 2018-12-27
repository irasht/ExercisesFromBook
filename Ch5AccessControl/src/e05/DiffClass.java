package e05;

public class DiffClass {
    public DiffClass() {
        CheckingAccess access = new CheckingAccess();
        access.publicNumb = 1;
        access.protectedNumb = 2;
        access.packageNumb = 3;
//        access.privateNumb = 4; error
        access.method();
//        access.method2(); error
        access.method3();
        access.method4();
    }
}