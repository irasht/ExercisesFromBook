package e12;

public class Root {
    Component1 c1 = new Component1(1);
    Component2 c2 = new Component2(2);
    Component3 c3 = new Component3(3);

    public Root(int numb) {
        System.out.println("Root");
    }

    public void dispose() {
        System.out.println("Root dispose");
        c3.dispose();
        c2.dispose();
        c1.dispose();
    }
}
