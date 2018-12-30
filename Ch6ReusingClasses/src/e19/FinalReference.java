package e19;

public class FinalReference {
    private String word;
    private final ReferenceClass reference;

    public FinalReference() {
        reference = new ReferenceClass("hello");
    }

    public FinalReference(String word) {
        this.word = word;
        reference = new ReferenceClass(word);
    }

    @Override
    public String toString() {
        return "FinalReference{" + "word='" + word + '\'' + ", reference=" + reference.getString() + '}';
    }
}
