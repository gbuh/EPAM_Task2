
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text {
    
    private LinkedList<Sentence> text = new LinkedList<>();

    public Text(String input) {
        
        Pattern pattern = Pattern.compile(
                "([\\w`]+)|([,;:\\-\"\'])|([!\\?\\.]+\\s+)"
                + "|(8[\\(]\\p{Digit}{3}[\\)]\\p{Digit}{3}-\\p{Digit}{2}-\\p{Digit}{2})"
                + "|([A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,}))");
        Matcher matcher = pattern.matcher(input);
        String email;
        String word;
        String phoneNumber;
        String punctuationMark;
        String sentenceEnd;
        
        Sentence sentence;
        LinkedList<SentenceElement> currentSentenceElements = new LinkedList<>();
        
        while (matcher.find()) {
            phoneNumber = matcher.group(4);
            if (phoneNumber != null) {
                currentSentenceElements.add(new PhoneNumber(phoneNumber));
            }
            
            email = matcher.group(5);
            if (email != null) {
                currentSentenceElements.add(new Email(email));
            }
            
            word = matcher.group(1);
            if (word != null) {
                currentSentenceElements.add(new Word(word));
            }
            punctuationMark = matcher.group(2);
            if (punctuationMark != null) {
                currentSentenceElements.add(new PunctuationMark(punctuationMark.charAt(0)));
            }
            sentenceEnd = matcher.group(3);
            if (sentenceEnd != null) {
                currentSentenceElements.add(new SentenceEnd(sentenceEnd));
                
                sentence = new Sentence(currentSentenceElements);
                currentSentenceElements = new LinkedList<>();
                text.add(sentence);
            }
            //System.out.println(w + " " + p + " " + e);
        }    
    }

    public LinkedList<Sentence> getText() {
        return text;
    }
    
    public ArrayList<Sentence> task2() {
        
        ArrayList<Sentence> textCopy = new ArrayList<>(text.size());
        //Collections.copy(textCopy, text);
        for(Sentence sentence : text) {
            textCopy.add(sentence);
        }
        
        Collections.sort(textCopy, new Comparator<Sentence>() {

            @Override
            public int compare(Sentence o1, Sentence o2) {
                return o1.wordsCount() - o2.wordsCount();
            }
            
        });
        return textCopy;
    }
}
