package e02;

import static net.mindview.util.Print.*;

public class Aliasing {
    float number;

    public static void main(String[] args) {
        Aliasing al1 = new Aliasing();
        Aliasing al2 = new Aliasing();
        al1.number = 10f;
        al2.number = 1f;
        print(al1.number + " and " + al2.number);
        al1 = al2;
        print(al1.number + " and " + al2.number);
        al1.number=5f;
        print(al1.number + " and " + al2.number);
    }
}
