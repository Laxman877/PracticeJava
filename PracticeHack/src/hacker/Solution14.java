package hacker;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Solution14 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter");
		int testcase=Integer.parseInt(sc.nextLine());
		while(testcase>0) {
			String pattern=sc.nextLine();
			try {
				Pattern.compile(pattern);
				System.out.println("valid");
			} catch (PatternSyntaxException e) {
				System.out.println("invalid");
			}
		}
	}
}
