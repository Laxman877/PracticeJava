package Basics;
import java.util.Scanner;

public class ArrGreatNum {
	public static void main(String[] args) {
		int max = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array: ");
		int size = sc.nextInt();
		int a[] = new int [size];
		System.out.println("enter the the element: ");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
			
		}
		max = a[0];
		for(int i = 0;i<size;i++) {
			if(max<a[i]) {
				max = a[i];
				
			}
		}
		System.out.println("maximum value in array is: "+max);
		
	}

}
