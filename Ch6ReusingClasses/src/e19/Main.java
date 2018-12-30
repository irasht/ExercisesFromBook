package e19;

public class Main {

    public static void main(String[] args) {
        FinalReference reference = new FinalReference();
        System.out.println(reference);
        FinalReference reference1 = new FinalReference("world");
        System.out.println(reference1);
    }
}
