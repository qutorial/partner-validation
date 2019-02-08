import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;

public class PhoneTestStrings {

    public static void main(String[] args) {

        String[] validNumbers= {"+36205211878"};
        String[] invalidNumbers= {"", "<<<====", "alert()", "123", "Bosch "};

        PhoneNumberUtil phoneUtil = PhoneNumberUtil.getInstance();
	PhoneNumber number;

        int numberOfItems = validNumbers.length;
        for (int i=0; i<numberOfItems; i++)
        {
            String numberstr = validNumbers[i];
	    try {
            	number = phoneUtil.parse(numberstr, "HU");
                System.out.println(number);
                System.out.println(phoneUtil.isValidNumber(number));
            } catch (NumberParseException e) {
            }
        }

        System.out.println();
        System.out.println("Invalid numbers:");

        numberOfItems = invalidNumbers.length;
        for (int i=0; i<numberOfItems; i++)
        {
            String numberstr = invalidNumbers[i];
            try {
            	number = phoneUtil.parse(numberstr, "DE");
	        System.out.println(number);
        	System.out.println(phoneUtil.isValidNumber(number));
            } catch (NumberParseException e) {
            }
        }
    }
}
