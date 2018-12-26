package e10;

public class FinalizeCall {
    public void finalize() {
        System.out.println("finalize() method");
    }

    public static void main(String args[]) {
        new FinalizeCall();
    }
}
