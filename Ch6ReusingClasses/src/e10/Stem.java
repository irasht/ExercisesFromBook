package e10;

public class Stem extends Root {
    Component1 c1 = new Component1(4);
    Component2 c2 = new Component2(5);
    Component3 c3 = new Component3(6);

    public Stem(int numb) {
        super(numb);
        System.out.println("Stem");
    }
}
