package e16;

public class StringArr {
    public static void main(String[] args) {
        System.out.println("First option");
        String[] arr = new String[5];
        arr[0] = "h";
        arr[1] = "e";
        arr[2] = "l";
        arr[3] = "l";
        arr[4] = "o";
        print(arr);
        System.out.println("Second option");
        String[] arr1 = {"hello", "world"};
        print(arr1);
    }

    private static void print(String[] arr) {
        for (String st : arr) {
            System.out.println(st);
        }
    }
}
