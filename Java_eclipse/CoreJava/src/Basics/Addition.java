package Basics;

import java.util.Scanner;

public class Addition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int sum = x+y;
		System.out.println("the sum of number is: "+sum);
		int sub = x-y;
		System.out.println("the sub of number is: "+sub);
		int mul = x*y;
		System.out.println("the mul of number is: "+mul);
		int div = x/y;
		System.out.println("the div of number is: "+div);
		int mdiv = x%y;
		System.out.println("the mdiv of number is: "+mdiv);
	}
}
