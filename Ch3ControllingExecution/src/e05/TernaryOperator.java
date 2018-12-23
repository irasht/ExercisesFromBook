package e05;

import static net.mindview.util.Print.*;

public class TernaryOperator {
    /**
     * (4) Repeat Exercise 10 from the previous chapter, using
     * the ternary operator and a bitwise test to display the ones
     * and zeroes, instead of Integer.toBinaryString( ).
     */

    private static void toBinaryString(int i) {
        char[] buffer = new char[32];
        int bufferPosition = 32;
        do {
            buffer[--bufferPosition] =
                    ((i & 0x01) != 0) ? '1' : '0';
            i >>>= 1;
        } while (i != 0);
        for (int j = bufferPosition; j < 32; j++)
            printnb(buffer[j]);
        print();
    }

    public static void main(String[] args) {
        int first = 0x5EA1;
        int second = 0x0B63;
        printnb("first = ");
        toBinaryString(first);
        printnb("second = ");
        toBinaryString(second);
        printnb("~first = ");
        toBinaryString(~first);
        printnb("~second = ");
        toBinaryString(~second);
        printnb("first & first = ");
        toBinaryString(first & first);
        printnb("first | first = ");
        toBinaryString(first | first);
        printnb("first ^ first = ");
        toBinaryString(first ^ first);
        printnb("first & second = ");
        toBinaryString(first & second);
        printnb("first | second = ");
        toBinaryString(first | second);
        printnb("first ^ second = ");
        toBinaryString(first ^ second);
    }
}

