package domain;

/**
 * This class represents a phone number as a sentence element
 * 
 * @version 1.6 06 Dec 2017
 * @author  Igor Lipko
 */
public class PhoneNumber implements SentenceElement {
    private String phoneNumber;

    public PhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "PhoneNumber={" + phoneNumber + '}';
    }
}