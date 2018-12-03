package e09;

public class Autoboxing {
    public static void main(String[] args) {
        Byte byteNumb = 10;
        byte bt = byteNumb;
        System.out.println("byte = " + bt);
        Short shortNumb = 10;
        short s = shortNumb;
        System.out.println("short = " + s);
        Integer intNumb = 10;
        int i = intNumb;
        System.out.println("int = " + i);
        Long longNumb = 10L;
        long l = longNumb;
        System.out.println("long = " + l);
        Boolean booleanVar = true;
        boolean b = booleanVar;
        System.out.println("boolean = " + b);
        Character character = 'A';
        char ch = character;
        System.out.println("char = " + ch);
        Float floatNumb = 10.0f;
        float f = floatNumb;
        System.out.println("float = " + f);
        Double doubleNumb = 10.0d;
        double d = doubleNumb;
        System.out.println("double = " + d);
    }
}
