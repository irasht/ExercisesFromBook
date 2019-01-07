package e16;

class Tricycle implements Cycle {
    public int wheels() {
        return 3;
    }
    public static CycleFactory factory = new CycleFactory() {
        @Override
        public Tricycle getCycle() {
            return new Tricycle();
        }
    };
}