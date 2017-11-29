
public class PunctuationMark implements TextElement {
    private String punctuationMark;

    public PunctuationMark(String punctuationMark) {
        this.punctuationMark = punctuationMark;
    }

    public String getWord() {
        return punctuationMark;
    }

    public void setWord(String punctuationMark) {
        this.punctuationMark = punctuationMark;
    }

    @Override
    public String getTextElement(Text text) {
        return punctuationMark;
    }
}
/*
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PunctuationMark extends Symbol {
    public PunctuationMark(char symbol) {
        super(symbol);
    }

    public static String isPunctuationMark(char symbol) {
        Pattern PunctuationPattern = Pattern.compile("[,;:\\-\"\']");
        Matcher PunctuationMatcher = PunctuationPattern.matcher("" + symbol);
        String punctuationMark = null;
        if (PunctuationMatcher.find()) {
            punctuationMark = PunctuationMatcher.group();
        } return punctuationMark;
    }

    //    public static boolean isPunctuationMark (char symbol) {
    //        if (symbol >= 'a' && symbol <= 'z' || symbol >= 'A' && symbol <= 'Z') {
    //            return false;
    //        } else {
    //            return true; 
    //        }
    //    }
}
*/