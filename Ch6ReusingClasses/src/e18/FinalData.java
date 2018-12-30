package e18;

public class FinalData {
    private final int numb;
    private static final int numb2 = 0;

    public FinalData(int numb) {
        this.numb = numb;
    }

    @Override
    public String toString() {
        return "private final int numb=" + numb + "; private static final int numb2=" + numb2;
    }

    public static void main(String[] args) {
        System.out.println("First object:");
        FinalData fd1 = new FinalData(1);
        System.out.println(fd1);
        System.out.println("Second object:");
        FinalData fd2 = new FinalData(5);
        System.out.println(fd2);
    }
}
