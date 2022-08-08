package Basics;
import java.util.Scanner;

public class Calswitch {
	public static void main(String[] args) {
		int  select = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1st: ");
		int n1 = sc.nextInt();
		System.out.println("enter 2nd: ");
		int n2 = sc.nextInt();
		System.out.println("select oprator: ");
		System.out.println("1 for add: ");
		System.out.println("2 for sub: ");
		System.out.println("3 for mul: ");
		System.out.println("4 for div: ");
		select = sc.nextInt();
		switch(select) {
		case 1:
			System.out.println("summation of: "+(n1+n2));
			break;
		case 2:
			System.out.println("substraction of: "+(n1-n2));
			break;
		case 3:
			System.out.println("multiplication of: "+(n1*n2));
			break;
		case 4:
			System.out.println("divition of: "+(n1/n2));
			break;
		default:
			System.out.println("invalid entry try again");
		}
	}
}
