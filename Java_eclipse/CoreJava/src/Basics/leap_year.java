package Basics;
//program for leap year
import java.util.Scanner;
public class leap_year {
	 public static void main(String[] args) {
	        int year;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("enter e year:: ");
	        year = sc.nextInt();
	        if((year%4==0 && year%100!=0) || year%400==0) {
	            System.out.println("year is leap year");
	        } else {
	            System.out.println("not leap year");
	        }

	    }

}
