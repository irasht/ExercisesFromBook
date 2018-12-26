package e17;

//This code creates only the array, not the objects that go into it.
class Test {
    Test(String st) {
        System.out.println("String constructor; st = " + st);
    }
}

public class App {
    // You can define the array as a field in the class:
    Test[] array1 = new Test[3];

    public static void main(String args[]) {
        // Or as a temporary inside main:
        Test[] array2 = new Test[3];
    }
}
