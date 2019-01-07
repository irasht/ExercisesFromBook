package e20;

interface AnInterface {
    class First {
        int number;

        public First(int number) {
            this.number = number;
        }

        public void method() {
            System.out.println("First.method()");
        }
    }
}

class Second implements AnInterface {
}

public class Main {
    public static void main(String[] args) {
        Second second = new Second();
        AnInterface.First first = new AnInterface.First(10);
        first.method();
    }
}


