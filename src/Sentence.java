
import java.util.LinkedList;

public class Sentence {

    private LinkedList<SentenceElement> sentence;

    public Sentence(LinkedList<SentenceElement> sentence) {
        this.sentence = sentence;
    }

    public int wordsCount() {
        int r = 0;
        for (SentenceElement e : sentence) {
            if (e instanceof Word) {
                ++r;
            }
        }
        return r;
    }

    @Override
    public String toString() {
        return "Sentence{" + "sentence=" + sentence + '}';
    }
}
