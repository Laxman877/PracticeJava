package hacker;

import java.util.Scanner;
class UserNameValidator{
	
	public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
}

public class Solution22 {
	private static final Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("enter");
		int n=Integer.parseInt(sc.nextLine());
		while(n-- != 0) {
			String userName = sc.nextLine();
			if(userName.matches(UserNameValidator.regularExpression)) {
				System.out.println("Valid");
			}else {
				System.out.println("Invalid");
			}
		}
	}
}
