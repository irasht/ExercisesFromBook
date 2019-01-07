package e23;

public class B {
    U[] uArr;

    public B(int size) {
        uArr = new U[size];
    }

    public boolean add(U element) {
        for (int i = 0; i < uArr.length; i++) {
            if (uArr[i] == null) {
                uArr[i] = element;
                return true;
            }
        }
        return false;
    }

    public boolean setNull(int number) {
        if (number < 0 || number >= uArr.length) {
            return false;
        }
        uArr[number] = null;
        return true;
    }

    public void callMethods() {
        for (int i = 0; i < uArr.length; i++)
            if (uArr[i] != null) {
                uArr[i].method1();
                uArr[i].method2();
                uArr[i].method3();
            }
    }
}
