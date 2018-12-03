package e08;

public class ManyObject {
    static String word = "Hello";

    public static void main(String[] args) {
        ManyObject ob1 = new ManyObject();
        ManyObject ob2 = new ManyObject();
        System.out.println(ob1.word + " == " + ob2.word);
        ob1.word=word+"!";
        System.out.println(ob1.word + " == " + ob2.word);
    }
}

