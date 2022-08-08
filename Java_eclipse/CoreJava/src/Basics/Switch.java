package Basics;
import java.util.Scanner;
public class Switch {
	public static void main(String[] args) {
		int choice = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num1: ");
		int num1 = sc.nextInt();
		System.out.println("enter num2: ");
		int num2 = sc.nextInt();
		System.out.println("enter choice: ");
		System.out.println("press 1 for add");
		System.out.println("press 2 for sub");
		System.out.println("press 3 for mul");
		System.out.println("press 4 for div");
		choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println(num1+num2);
			break;
		case 2:
			System.out.println(num1-num2);
			break;
		case 3:
			System.out.println(num1*num2);
			break;
		case 4:
			System.out.println(num1/num2);
			break;
		default:
			System.out.println("invalid entry try again");
		}
		
	}
}
