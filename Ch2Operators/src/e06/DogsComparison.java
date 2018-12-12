package e06;

public class DogsComparison {
    static void compare(Dog dog1, Dog dog2) {
        System.out.println("== references: " + (dog1 == dog2));
        System.out.println("equals() references: " + dog1.equals(dog2));
        System.out.println("== on names: " + (dog1.name == dog2.name));
        System.out.println("equals() on names: " + dog1.name.equals(dog2.name));
        System.out.println("== on says: " + (dog1.says == dog2.says));
        System.out.println("equals() on says: " + dog1.says.equals(dog2.says));
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = dog1;
        dog1.name = "spot";
        dog1.says = "ruff!";
        dog2.name = "scruffy";
        dog2.says = "wurf!";
        System.out.println("dog1 and dog2 objects:");
        System.out.println("------------------------");
        compare(dog1, dog2);
        System.out.print("------------------------");
        System.out.println("\ndog1 and dog3 objects:");
        System.out.println("------------------------");
        compare(dog1, dog3);
        System.out.print("------------------------");
        System.out.println("\ndog2 and dog3 objects:");
        System.out.println("------------------------");
        compare(dog2, dog3);
    }
}

