import java.util.regex.Matcher;
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
