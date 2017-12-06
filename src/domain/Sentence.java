package domain;

import java.util.LinkedList;

/**
 * This class represents a sentence which consists of a list of
 * a sentence element(words, email, phone numbers, punctuation marks,
 * sentence ends). 
 * 
 * @version 1.6 06 Dec 2017
 * @author  Igor Lipko
 */
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
