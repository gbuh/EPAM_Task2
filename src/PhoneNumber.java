/*
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber extends Word {
    public PhoneNumber(String word) {
        super(word);
    }
    
    public static String isPhoneNumber(String word) {
        Pattern PhoneNumberPattern = Pattern.compile(
                "^[8]+(([0-9]{3})+([0-9]{3})+[-]+([0-9]{2})+([0-9]{2})$");
        Matcher PhoneNumberMatcher = PhoneNumberPattern.matcher("" + word);
        String phoneNumber = null;
        if (PhoneNumberMatcher.find()) {
            phoneNumber = PhoneNumberMatcher.group();
        } return phoneNumber;
    }
}
*/