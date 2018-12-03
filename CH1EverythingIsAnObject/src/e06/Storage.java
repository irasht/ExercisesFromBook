package e06;

public class Storage {
    String s="Hello";
    int storage(String s) {
        return s.length() * 2;
    }
    void print(){
        System.out.println(storage(s));
    }

    public static void main(String[] args) {
       Storage stor=new Storage();
       stor.print();
    }
}
