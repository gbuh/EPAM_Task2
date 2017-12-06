package test;

import logic.TextParser;

/**
 * This program read the text from the file,
 * disassembled the text into elements and
 * text words beginning with vowels are sorted alphabetically
 * by the first consonant letter of the word
 * 
 * @version 1.6 06 Dec 2017
 * @author  Igor Lipko
 */
public class Main {

    public static void main(String[] args) {
        TextParser textParser = new TextParser();
        textParser.parse();
    }
}
