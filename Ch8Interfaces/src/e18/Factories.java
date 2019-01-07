package e18;

public class Factories {
    private static void getService(CycleFactory fact) {
        Cycle cycle = fact.getCycle();
        System.out.println("Number of wheels: " + cycle.wheels());
    }

    public static void main(String[] args) {
        getService(new UnicycleFactory());
        getService(new BicycleFactory());
        getService(new TricycleFactory());
    }
}