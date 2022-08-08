package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharValidation {
	public static boolean charCheck(String lname) {
		String regex="^[a-zA-Z]*$";
		Pattern pattern=Pattern.compile(regex);
		
		Matcher matcher=pattern.matcher(lname);
		return matcher.matches();
	}
}
