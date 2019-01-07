package e15;

public class SecondClass {
    public FirstClass get(int number) {
        return new FirstClass(number);
    }
    public FirstClass get1(int number) {
        return new FirstClass(number){
            @Override
            public void method() {
                System.out.println("SecondClass.get1.method()");
            }
        };
    }
}
