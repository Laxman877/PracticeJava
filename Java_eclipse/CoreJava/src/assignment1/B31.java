package assignment1;
//Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer
import java.util.Scanner;

public class B31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the first number: ");
		int x = sc.nextInt();
		System.out.print("enter the second number: ");
		int y = sc.nextInt();
		System.out.print("enter the third number: ");
		int z = sc.nextInt();
		System.out.print("the result is: "+sumoftwo(x,y,z));
		System.out.print("\n");
	}
	public static boolean sumoftwo(int p, int q, int r) {
		return ((p+q)==r||(q+r)==p||(p+r)==q);
	}
}
