package domain;

/**
 * This class represents a punctuation mark
 * 
 * @version 1.6 06 Dec 2017
 * @author  Igor Lipko
 */
public class PunctuationMark extends Symbol implements SentenceElement {
    public PunctuationMark(char punctuationMark) {
        super(punctuationMark);
    }

    @Override
    public String toString() {
        return "PunctuationMark={" + super.getSymbol() + "}";
    }
}
