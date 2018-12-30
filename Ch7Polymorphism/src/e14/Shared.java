package e14;

public class Shared {
    private int referenceCount;

    public Shared() {
        System.out.println("Shared constructor");
    }

    public void addReference() {
        System.out.println("Number of references " + ++referenceCount);
    }

    protected void dispose() {
        if (--referenceCount == 0)
            System.out.println("Disposing " + this);
    }

    public String toString() {
        return "Shared ";
    }

}
