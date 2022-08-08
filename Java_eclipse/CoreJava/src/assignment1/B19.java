package assignment1;
//first 10 natural numbers
import java.util.Scanner;

public class B19 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		
		int i = sc.nextInt();
		while(i<=10) {
			System.out.println(i);
			i= i+1;
		}
	}

}
