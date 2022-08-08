package assignment1;
//Write a Java program that accepts two integer values between 25 to 75 and return true if there is a common digit in both
import java.util.Scanner;

public class B32 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int n = sc.nextInt();
		System.out.println("Enter the second number: ");
		int m = sc.nextInt();
		System.out.println("Result: "+common_digit(n ,m));
		
	}
	public static boolean common_digit(int p, int q) {
		if(p<25||q>75)
			return false;
		int x = p%10;
		int y = q%10;
		p/=10;
		q/=10;
		return (p==q||p==y||x==q||x==y);
	}

}
