
public class SentenceEnd implements SentenceElement {
    private String sentenceEnd;
    public SentenceEnd(String sentenceEnd) {
        this.sentenceEnd = sentenceEnd;
    }
    
    public String getSentenceEnd() {
        return sentenceEnd;
    }

    @Override
    public String toString() {
        return "SentenceEnd={" + sentenceEnd + "}";
    }
}
