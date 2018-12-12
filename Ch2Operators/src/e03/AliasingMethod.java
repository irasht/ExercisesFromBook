package e03;

class FloatNumber {
    float numb;
}

public class AliasingMethod {
    static void run(FloatNumber floatNumber) {
        floatNumber.numb = 5;
    }

    public static void main(String[] args) {
        FloatNumber fn=new FloatNumber();
        fn.numb=10;
        System.out.println(fn.numb);
        run(fn);
        System.out.println(fn.numb);
    }
}

