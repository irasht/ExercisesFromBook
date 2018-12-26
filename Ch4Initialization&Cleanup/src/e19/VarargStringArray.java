package e19;

public class VarargStringArray {

    public static void printStrings(String... args) {
        for (String string : args)
            System.out.println(string);
        System.out.println();
    }

    public static void main(String[] args) {
        printStrings("have ", "a ", "nice ", "day");
//        printStrings(new String("hello"), new String("world"));
        printStrings(new String[]{"Some", "strings"}
        );
    }
}
