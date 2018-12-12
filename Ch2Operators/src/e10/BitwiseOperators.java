package e10;

public class BitwiseOperators {
    public static void main(String[] args) {
        int numb1 = 0x5EA1;
        int numb2 = 0x0B63;
        System.out.println("numb1 = " + Integer.toBinaryString(numb1));
        System.out.println("numb2 = " + Integer.toBinaryString(numb2));
        System.out.println("~numb1 = " + Integer.toBinaryString(~numb1));
        System.out.println("~numb2 = " + Integer.toBinaryString(~numb2));
        System.out.println("numb1 & numb1 = " + Integer.toBinaryString(numb1 & numb1));
        System.out.println("numb1 | numb1 = " + Integer.toBinaryString(numb1 | numb1));
        System.out.println("numb1 ^ numb1 = " + Integer.toBinaryString(numb1 ^ numb1));
        System.out.println("numb1 & numb2 = " + Integer.toBinaryString(numb1 & numb2));
        System.out.println("numb1 | numb2 = " + Integer.toBinaryString(numb1 | numb2));
        System.out.println("numb1 ^ numb2 = " + Integer.toBinaryString(numb1 ^ numb2));
    }
}

