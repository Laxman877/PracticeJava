package assignment1;
//Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn. 

import java.util.Scanner;

public class B28 {

	public static void main(String[] args) {
		int i;
		char s1,s2 ,s3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number: ");
		i=sc.nextInt();
		System.out.printf("%d+ %d%d + %d%d%d\n",i,i,i,i,i,i);
	}
}
