package Validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberValidation {
	public static boolean numCheck(String mobile) {
		String regex="(0/91)?[7-9][0-9]{9}";
		Pattern pattern=Pattern.compile(regex);
		
		Matcher matcher=pattern.matcher(mobile);
		return matcher.matches();
	}
}
