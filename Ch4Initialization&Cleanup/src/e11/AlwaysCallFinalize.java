package e11;

public class AlwaysCallFinalize {
    public void finalize() {
        System.out.println("finalize() method");
    }

    public static void main(String args[]) {
        new AlwaysCallFinalize();
        System.gc();
        System.runFinalization();
    }
}
