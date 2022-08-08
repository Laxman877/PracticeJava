package hacker;

import java.util.Scanner;

public class Solution13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your sentence");
		String s = scan.nextLine();
		s = s.trim();
		if (s.length() == 0) {
			System.out.println(0);
		} else {
			String[] strings = s.split("['!?,._@ ]+");
			System.out.println(strings.length);
			for (String str : strings)
				System.out.println(str);
			scan.close();
		}
	}
}
