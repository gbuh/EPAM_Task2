package domain;

/**
 * This is the abstract class to store and manipulate symbols.
 * 
 * @version 1.6 06 Dec 2017
 * @author  Igor Lipko
 */
public abstract class Symbol {
    private char symbol;

    public Symbol(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }
}
