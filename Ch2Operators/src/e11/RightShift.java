package e11;

public class RightShift {
    public static void main(String[] args) {
//        int i = 0x80000000; //31
        int hexNumb = 0x10000;
        System.out.println(Integer.toBinaryString(hexNumb));
        for (int i = 0; i < 16; i++) {
            hexNumb >>= 1;
            System.out.println(Integer.toBinaryString(hexNumb));
        }
    }
}
