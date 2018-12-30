package e05;

public class Main {
    public static void ride(Cycle cycle) {
        int numberOfWheels = cycle.wheels();
        switch (numberOfWheels) {
            case 0:
                System.out.println("There is no wheel");
                break;
            case 1:
                System.out.println("There is " + numberOfWheels + " wheel");
                break;
            default:
                System.out.println("There are " + numberOfWheels + " wheels");
        }

    }

    public static void main(String[] args) {
        ride(new Cycle());
        ride(new Unicycle());
        ride(new Bicycle());
        ride(new Tricycle());
    }
}
