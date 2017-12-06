
import java.util.LinkedList;

public class Sentence {

    private LinkedList<SentenceElement> sentence;

    public Sentence(LinkedList<SentenceElement> sentence) {
        this.sentence = sentence;
    }

    @Override
    public String toString() {
        return "Sentence={" + sentence + '}';
    }
}
