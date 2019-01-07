package e18;

class TricycleFactory implements CycleFactory {
    @Override
    public Tricycle getCycle() {
        return new Tricycle();
    }
}