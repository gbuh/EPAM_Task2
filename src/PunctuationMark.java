
public class PunctuationMark extends Symbol implements SentenceElement {
    public PunctuationMark(char punctuationMark) {
        super(punctuationMark);
    }

    @Override
    public String toString() {
        return "PunctuationMark={" + super.getSymbol() + "}";
    }
}
