package array;
import java.util.Scanner;

public class ArrayUser {
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.println("enter  the size of array");
		int size = sc.nextInt();
		int a[]=new int [size];
		for(int i=0;i<a.length;i++) {
			System.out.println("enter the value for index: "+i);
			a[i]=sc.nextInt();
			
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
