package domain;

/**
 * This class represents a word, provides method to compare 2 words by their
 * lexicographical order.
 * 
 * @version 1.6 06 Dec 2017
 * @author  Igor Lipko
 */
public class Word implements Comparable<Word>, SentenceElement {
    private String word;

    public Word(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    @Override
    public String toString() {
            return word;
    }

    @Override
    public int compareTo(Word anotherWord) {
            return word.compareToIgnoreCase(anotherWord.getWord());
    }
}