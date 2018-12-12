package e12;

public class UnsignedRightShift {
    public static void main(String[] args) {
        int numb = -1;
        numb >>>= 1;
        System.out.println(Integer.toBinaryString(numb));
        for (int i = 0; i < 30; i++) {
            numb >>= 1;
            System.out.println(Integer.toBinaryString(numb));
        }
    }
}
