package e17;

public class Frog extends Amphibian {
    @Override
    public void liveInWater() {
        System.out.println("Frog swimming in the water");
    }

    @Override
    public void liveOnLand() {
        System.out.println("Frog jumping on the land");
    }
}
