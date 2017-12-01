
public class Symbol implements SentenceElement {
    private char symbol;

    public Symbol(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return "Symbol{" + "symbol=" + symbol + '}';
    }
}
