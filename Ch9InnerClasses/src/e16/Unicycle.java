package e16;

class Unicycle implements Cycle {
    public int wheels() {
        return 1;
    }

    public static CycleFactory factory = new CycleFactory() {
        @Override
        public Unicycle getCycle() {
            return new Unicycle();
        }
    };
}