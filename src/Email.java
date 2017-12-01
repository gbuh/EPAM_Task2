/*
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email extends Word {
    public Email(String word) {
        super(word);
    }
    
    public static String isEmail(String word) {
        Pattern EmailPattern = Pattern.compile("^[A-Za-z0-9-]"
                + "+(\\\\.[A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\\\.[A-Za-z0-9]+)"
                + "*(\\\\.[A-Za-z]{2,})$\"");
        Matcher EmailMatcher = EmailPattern.matcher("" + word);
        String email = null;
        if (EmailMatcher.find()) {
            email = EmailMatcher.group();
        } return email;
    }
}
*/