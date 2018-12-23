package e10;

class Vampire {

    public static void findVampire(String x, String s, int vampire) {
        for (int i = 0; i < s.length(); i++) {
            findVampire(x + s.charAt(i), s.substring(0, i) + s.substring(i + 1), vampire);
            if (s.length() == 1) {
                x = x + s;
                int leftPart = Integer.parseInt(x.substring(0, 2));
                int rightPart = Integer.parseInt(x.substring(2));
                if (leftPart * rightPart == vampire) {
                    System.out.println(vampire + " = " + leftPart + " * " + rightPart);
                }

            }
        }
    }

    public static void main(String[] args) {
        System.out.println("The vampire numbers are: ");
        for (int i = 1001; i < 10000; i++) {
            findVampire("", Integer.toString(i), i);
        }
    }
}