package e03;

class Outer {
    private String string;

    public Outer(String string) {
        this.string = string;
    }

    class Inner {
        @Override
        public String toString() {
            return string;
        }
    }

    Inner getInner() {
        return new Inner();
    }
}
