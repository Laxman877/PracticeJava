package Basics;
import java.util.Scanner;
public class Pattern2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows = sc.nextInt();
		int i = rows;
		while(i>=1){
			int j = 1;
			while(j<=i) {
				System.out.print("*");
				j = j + 1;
			}
			System.out.println();
			i = i - 1;
		}
		sc.close();
	}
}
