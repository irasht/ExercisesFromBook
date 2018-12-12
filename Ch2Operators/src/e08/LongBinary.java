package e08;

public class LongBinary {
    public static void main(String[] args) {
       // Long.toBinaryString( ) does not print leading zeroes.
        long long1 = 0x2f; // Hexadecimal (lowercase)
        System.out.println("long1: " + Long.toBinaryString(long1));
        int long2 = 0X2F; // Hexadecimal (uppercase)
        System.out.println("long2: " + Long.toBinaryString(long2));
        int long3 = 0177; // Octal (leading zero)
        System.out.println("long3: " + Long.toBinaryString(long3));
    }
}
