package e07;

class Incrementable {
    static void increment() {
        StaticTest.i++;
    }

    public static void main(String[] args) {
        Incrementable sf = new Incrementable();
        sf.increment();
        Incrementable.increment();
        increment();
    }
}