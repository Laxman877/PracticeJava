package arrays;

import java.sql.Array;
import java.util.Arrays;

public class CopyOfArray {
	public static void main(String[] args) {
		int[]arr= {10,45,22,75,36,96,41,23,74,63};
		int[]arr1=new int[10];
		System.out.println("source array: "+Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++) {
			arr1[i]=arr[i];
		}
		System.out.println("new array: "+Arrays.toString(arr1));
	}
}
