package e12;

public class Tank {
    static int counter;
    int id = counter++;
    boolean full = false;

    Tank() {
        System.out.println("Tank " + id);
        full = true;
    }

    public void isEmpty() {
        full = false;
    }

    protected void finalize() {
        if (full) {
            System.out.println("Error: Tank " + id + " must be empty at cleanup");
        } else {
            System.out.println("You cleaned up Tank " + id);
        }
    }

    public static void main(String args[]) {
        new Tank().isEmpty();
        new Tank();
        System.out.println("call gc:");
        System.gc();
        System.runFinalization();
    }
}
