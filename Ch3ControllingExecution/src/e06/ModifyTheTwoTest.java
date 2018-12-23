package e06;

public class ModifyTheTwoTest {
    public static void main(String[] args) {
        System.out.println((test(10, 5, 20)));
        System.out.println((test(5, 10, 12)));
        System.out.println((test(5, 5, 6)));
    }

    private static boolean test(int testval, int begin, int end) {
        boolean result = false;
        if (testval >= begin && testval <= end) {
            result = true;
        }
        return result;
    }

    private static boolean test1(int testval, int begin, int end) {
        if (testval >= begin && testval <= end) {
            return true;
        }
        return false;
    }

}
