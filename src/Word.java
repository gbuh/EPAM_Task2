
public class Word implements SentenceElement {
    private String word;

    public Word(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return "Word{" + "word=" + word + '}';
    }
}