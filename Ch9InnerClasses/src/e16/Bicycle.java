package e16;

class Bicycle implements Cycle {
    public int wheels() {
        return 2;
    }

    public static CycleFactory factory = new CycleFactory() {
        @Override
        public Bicycle getCycle() {
            return new Bicycle();
        }
    };
    //    public static CycleFactory factory = () -> new Bicycle();
    //    public static CycleFactory factory = Bicycle::new;
}