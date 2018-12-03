package e16;

class Tree {
    /**
     * The height of a Tree
     */
    int height;

    Tree() {
        System.out.println("Planting a seedling");
        height = 0;
    }

    Tree(int initialHeight) {
        height = initialHeight;
        System.out.println("Creating new Tree that is " + height + " feet tall");
    }

    /**
     * Prints tree height.
     */
    void info() {
        System.out.println("Tree is " + height + " feet tall");
    }

    /**
     * Overloaded method. Prints tree height.
     *
     * @param s the string to display.
     */
    void info(String s) {
        System.out.println(s + ": Tree is " + height + " feet tall");
    }
}

/**
 * Test code for Tree class
 */
class Overloading {
    /**
     * Entry point to class and application.
     *
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("overloaded method");
        }
// Overloaded constructor:
        new Tree();
    }
}