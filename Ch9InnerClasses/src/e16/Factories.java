package e16;

public class Factories {
    private static void ride(CycleFactory fact) {
        Cycle cycle = fact.getCycle();
        System.out.println("Number of wheels: " + cycle.wheels());
    }

    public static void main(String[] args) {
        ride(Unicycle.factory);
        ride(Bicycle.factory);
        ride(Tricycle.factory);
    }
}