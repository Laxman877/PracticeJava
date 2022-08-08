package Basics;
import java.util.Scanner;
public class Pattern3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows = sc.nextInt();
		int i = 1;
		while(i<=rows) {
			int j = rows;
			while(j>i) {
				System.out.print(" ");
				j = j - 1;
			}
			int k = 1;
			while(k<=i) {
				System.out.print("*");
				k = k +  1;
			}
			System.out.println();
			i = i + 1;
		}
		sc.close();
	}

}
