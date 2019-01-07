package e04;

interface Selector {
    boolean end();

    Object current();

    void next();
}