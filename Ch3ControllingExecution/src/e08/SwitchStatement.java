package e08;

import static net.mindview.util.Print.*;

public class SwitchStatement {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++)
            switch (i) {
                case 0:
                    print("case 0");
                    break;
                case 1:
                    print("case 1");
                    break;
                case 2:
                    print("case 2");
                    break;
                case 3:
                    print("case 3");
                    break;
                default:
                    print("default");
            }
        System.out.println("remove the break");
        for (int i = 0; i < 3; i++)
            switch (i) {
                case 0:
                    print("case 0");
                case 1:
                    print("case 1");
                case 2:
                    print("case 2");
                default:
                    print("default");
            }
    }
}

