package hacker;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution23 {
	public static void main(String[] args) {
		String regex = "<([^<>]+)>([^<>]+)</\\1>";
	      Pattern pattern = Pattern.compile(regex);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		int testCases = Integer.parseInt(sc.nextLine());
		while(testCases>0) {
			String line=sc.nextLine();
			Matcher matcher = pattern.matcher(line);
			int counter=0;
			while(matcher.find()) {
				System.out.println(matcher.group(2));
				counter++;
			}
			if(counter == 0)
				System.out.println("none");
			testCases--;
		}
	}
}
