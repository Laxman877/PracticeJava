package Basics;
import java.util.Scanner;
public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks obtained by student: ");
		int marks = sc.nextInt();
		sc.close();
		if(marks>=75 && marks<=100) {
			System.out.println("A Grade");
		} else if (marks>=60 && marks<=74) {
			System.out.println("B Grade");
		}else if(marks>=40 && marks<=59) {
			System.out.println("C Grade");
		}else if(marks>=0 && marks<=39) {
			System.out.println("Faill");
		}else {
			System.out.println("Wrong entry please try again");
		}
	}

}
