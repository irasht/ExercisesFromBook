package e17;

public class Main {
    public static void main(String[] args) {
        Cycle[] cycles = new Cycle[]{
                new Unicycle(),
                new Bicycle(),
                new Tricycle()
        };
//        ERROR DON'T WORK!!! balance() not found in Cycle:
       /* cycles[0].balance();
        cycles[1].balance();
        cycles[2].balance();*/
        ((Unicycle) cycles[0]).balance(); // Downcast
        ((Bicycle) cycles[1]).balance(); // Downcast
        ((Unicycle) cycles[2]).balance(); //ClassCastException
    }
}
