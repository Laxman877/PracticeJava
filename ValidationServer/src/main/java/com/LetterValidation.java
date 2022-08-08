package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LetterValidation {
	public static boolean letterCheck(String fname) {
		String regex="^[a-zA-Z]*$";
		Pattern pattern=Pattern.compile(regex);
		
		Matcher matcher=pattern.matcher(fname);
		return matcher.matches();
	}
}
