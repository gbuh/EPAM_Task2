package domain;

/**
 * This class represents a marks the end of sentence
 * 
 * @version 1.6 06 Dec 2017
 * @author  Igor Lipko
 */
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
