package assignment1;

import java.util.Scanner;

//Write a Java program to break an integer into a sequence of individual digits. 
public class B35 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input six non-negative digit: ");
		int i = sc.nextInt();
		int n1 = i / 100000 % 10;
		int n2 = i / 10000 % 10;
		int n3 = i / 1000 % 10;
		int n4 = i / 100 % 10;
		int n5 = i / 10 % 10;
		int n6 = i % 10;
		System.out.println(n1+" "+n2+" "+n3+" "+n4+" "+n5+" "+n6);
	}

}
