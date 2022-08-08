package assignment1;
//Write a Java program to print the ascii value of a given character. 

import java.util.Scanner;

public class B27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr a characer");
		char ch = sc.next().charAt(0);
		int ascciValue = ch;
		System.out.println("Ascci value of: "+ch+" is: "+ascciValue);
	}
}
