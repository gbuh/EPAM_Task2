
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text {
    private LinkedList<Sentence> text = new LinkedList<>();
    private ArrayList<Word> words = new ArrayList<>();

    public Text(String input) {
        Pattern pattern = Pattern.compile(
                "([A-Za-z0-9\\-]+([\\.\\_][A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,}))"
                        + "|(8[\\(]\\p{Digit}{3}[\\)]\\p{Digit}{3}-\\p{Digit}{2}-\\p{Digit}{2})"
                        + "|([\\w`]+)|([,;:\\-\"\'])|([!\\?\\.]+\\s+)");
        Matcher matcher = pattern.matcher(input);

        String email;
        String word;
        String phoneNumber;
        String punctuationMark;
        String sentenceEnd;

        Sentence sentence;
        Word newWord;
        LinkedList<SentenceElement> currentSentenceElements = new LinkedList<>();

        while (matcher.find()) {
            phoneNumber = matcher.group(5);
            if (phoneNumber != null) {
                currentSentenceElements.add(new PhoneNumber(phoneNumber));
            }

            email = matcher.group(1);
            if (email != null) {
                currentSentenceElements.add(new Email(email));
            }

            word = matcher.group(6);
            if (word != null) {
                newWord = new Word(word);
                currentSentenceElements.add(newWord);
                Matcher matcherWord = (Pattern.compile("[aeiouy][^aeiouy]+")).matcher(word);
                if (matcherWord.matches()) {
                    words.add(newWord);
                }
            }

            punctuationMark = matcher.group(7);
            if (punctuationMark != null) {
                currentSentenceElements.add(new PunctuationMark(punctuationMark.charAt(0)));
            }

            sentenceEnd = matcher.group(8);
            if (sentenceEnd != null) {
                currentSentenceElements.add(new SentenceEnd(sentenceEnd));

                sentence = new Sentence(currentSentenceElements);
                currentSentenceElements = new LinkedList<>();
                text.add(sentence);
            }
        }    
    }

    public LinkedList<Sentence> getText() {
        return text;
    }

    public ArrayList<Word> getWords() {
        return words;
    }

    public ArrayList<Word> task2() {

        ArrayList<Word> wordsCopy = new ArrayList<>(words.size());
        for(Word word : words) {
            wordsCopy.add(word);
        }
        Collections.sort(wordsCopy, new Comparator<Word>() {

            public int compare(Word o1, Word o2) {
                return o1.compareTo(o2);
            }
        });
        return wordsCopy;
    }
}
