package Basics;
import java.util.Scanner;
// program for find greatest number from three
public class Greaternum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three number:  ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		if((x>y)&&(x>z)) {
				System.out.println("The greater value is: "+x);
			}
		else if(y>z) {
				System.out.println("The greater value is: "+y);
			}
		
			 else {
				System.out.println("The greater value is: "+z);
			}
	}
}
