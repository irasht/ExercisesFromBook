package e18;

class BicycleFactory implements CycleFactory {
    @Override
    public Bicycle getCycle() {
        return new Bicycle();
    }
}