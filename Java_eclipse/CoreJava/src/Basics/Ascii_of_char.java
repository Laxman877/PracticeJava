package Basics;
//for find Ascii value of charater
import java.util.Scanner;
public class Ascii_of_char {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character : ");
		char ch = sc.next().charAt(0);
		int i = ch;
		System.out.println(i);
	}
}
