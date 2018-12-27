package e05.diff;

import e05.CheckingAccess;

public class DiffPackage {
    CheckingAccess access = new CheckingAccess();

    public DiffPackage() {
        access.publicNumb = 1;
//        access.protectedNumb = 2;// error
//        access.packageNumb = 3; //error
//        access.privateNumb = 4; //error
        access.method();
//        access.method2(); //error
//        access.method3();// error
//        access.method4();//error
    }
}
