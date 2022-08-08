package Basics;
import java.util.Scanner;

public class Arr2ndGreatNum {
	public static void main(String[] args) {
		int n , max;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter element you wantInt in array: ");
		n= sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter all the element");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]>a[j]) {
					max = a[i];
					a[i]=a[j];
					a[j]=max;
				}
			}
		}
		System.out.println("second largest element the array is: "+a[n-2]);
	}
	
}