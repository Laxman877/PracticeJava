package assignment1;
//Write a Java program that accepts two double variables and test if both strictly between 0 and 1 and false otherwise
import java.util.Scanner;

public class B34 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number: ");
		double n1 = sc.nextDouble();
		System.out.println("enter second number: ");
		double n2 = sc.nextDouble();
		System.out.println(n1>0 && n1<1 && n2>0 && n2<1);
	}
}
