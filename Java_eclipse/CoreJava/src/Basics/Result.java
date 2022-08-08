package Basics;

import java.util.Scanner;
 
public class Result {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter marks");
		int x = sc.nextInt();
		if(x>=75) {
			System.out.println("Grade A");
		} else if (x>=50) {
			System.out.println("Grade B");
		} else if(x>=40) {
			System.out.println("Grade C");
		} else {
			System.out.println("Fail");
		}
		
	}

}
