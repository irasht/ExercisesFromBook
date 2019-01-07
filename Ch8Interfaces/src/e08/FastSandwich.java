package e08;

import e08.meal.Sandwich;

public class FastSandwich extends Sandwich implements FastFood {
    @Override
    public void order() {
        System.out.println("Order sandwich");
    }

    @Override
    public void eat() {
        System.out.println("Chomp! Snort! Gobble!");
    }
}
