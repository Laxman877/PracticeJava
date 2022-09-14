package javaTpoint;

import java.util.Scanner;

public class PerfectSquare {
//	static boolean checkPerfectSquare(double number) {
//		double sqrt=Math.sqrt(number);
//		return ((sqrt-Math.floor(sqrt))==0);
//	}
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a number:");
//		double number=sc.nextDouble();
//		if(checkPerfectSquare(number))
//		System.out.println("Yes,the given number is perfect suqare.");
//		else
//			System.out.println("No,the gievn number is not perfect suqare.");
//	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		double number=sc.nextDouble();
		if(checkPerfectsuquare(number)) 
			System.out.println("Yes, the given number is perfect square.");
		else
			System.out.println("No, the given number is not perfect square.");
	}
	static boolean checkPerfectsuquare(double number) {
		for(int i=1;i*i<=number;i++) {
			if((number%i==0) && (number/i==i)) {
				return true;
			}
		}
		return false;
	}
}
