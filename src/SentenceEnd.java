
public class SentenceEnd implements TextElement {
    private String sentenceEnd;

    public SentenceEnd(String sentenceEnd) {
        this.sentenceEnd = sentenceEnd;
    }

    public String getWord() {
        return sentenceEnd;
    }

    public void setWord(String sentenceEnd) {
        this.sentenceEnd = sentenceEnd;
    }

    @Override
    public String getTextElement(Text text) {
        return sentenceEnd;
    }
}
/*import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentenceEnd extends Symbol {
    public SentenceEnd(char symbol) {
        super(symbol);
    }

    public static String isSentenceEnd(char symbol) {
        Pattern PunctuationPattern = Pattern.compile("[!\\?\\.]");
        Matcher PunctuationMatcher = PunctuationPattern.matcher("" + symbol);
        String sentenceEnd = null;
        if (PunctuationMatcher.find()) {
            sentenceEnd = PunctuationMatcher.group();
        } return sentenceEnd;
    }
}
*/