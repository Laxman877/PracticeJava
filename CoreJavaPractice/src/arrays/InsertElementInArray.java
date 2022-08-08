package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElementInArray {
	public static void main(String[] args) {
		int[] arr= {12,34,75,96,14,25,36,14};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr index");
		int ind_position=sc.nextInt();
		System.out.println("enter value");
		int newvalue=sc.nextInt();
//		int ind_position=2;
//		int newvalue=65;
		
		System.out.println("original array: "+Arrays.toString(arr));
		for(int i=arr.length-1;i>ind_position;i--) {
			arr[i]=arr[i-1];
		}
		arr[ind_position]=newvalue;
		System.out.println("new array: "+Arrays.toString(arr));
	}
}
