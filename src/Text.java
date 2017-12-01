
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text {
    
    private LinkedList<Sentence> text = new LinkedList<>();

    public Text(String input) {
        
        Pattern pattern = Pattern.compile("([\\w']+)|([,;:\\-\"\'])|([!\\?\\.]+)");
        Matcher matcher = pattern.matcher(input);
        String word;
        String punctuatioMark;
        String sentenceEnd;
        
        Sentence sentence;
        LinkedList<SentenceElement> currentSentenceElements = new LinkedList<>();
        
        while (matcher.find()) {
            word = matcher.group(1);
            if (word != null) {
                currentSentenceElements.add(new Word(word));
            }
            punctuatioMark = matcher.group(2);
            if (punctuatioMark != null) {
                currentSentenceElements.add(new Symbol(punctuatioMark.charAt(0)));
            }
            sentenceEnd = matcher.group(3);
            if (sentenceEnd != null) {
                currentSentenceElements.add(new Symbol(sentenceEnd.charAt(0)));
                
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
