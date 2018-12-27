package e06;

class ProtectedData {
    protected String word;
}

public class ProtectedClasses {
    public static void main(String[] args) {
        ProtectedData data = new ProtectedData();
        data.word = "hello";
        System.out.println(data.word);
    }
}
