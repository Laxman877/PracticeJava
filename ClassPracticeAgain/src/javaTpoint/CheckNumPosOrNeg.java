package javaTpoint;

import java.util.Scanner;

public class CheckNumPosOrNeg {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a number");
//		int num=sc.nextInt();
//		if(num>0) {
//			System.out.println("Number is positive");
//		}else if(num<0) {
//			System.out.println("Number is negative");
//		}else {
//			System.out.println("Number is Zero");
//		}
		System.out.println("Enter a number you want to check:");
		double num=sc.nextDouble();
		double result;
		
		result=Math.signum(num);
		System.out.print(result);
	}
}
