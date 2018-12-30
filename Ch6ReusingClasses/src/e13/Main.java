package e13;

public class Main {

    public static void main(String[] args) {
	OverloadOneMoreTime overload =new OverloadOneMoreTime();
	overload.method(1);
	overload.method1(1.1);
	overload.method2('x');
	overload.method3("word");
    }
}
