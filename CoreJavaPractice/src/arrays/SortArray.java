package arrays;

import java.util.Arrays;

public class SortArray {
	public static void main(String[] args) {
		int arr[]= {9,8,2,4,7,6,3,5,1};
		String arr1[]= {"java","php","android","python","c#"};
		
		System.out.println("Original Numeric array: "+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("sorted array : "+Arrays.toString(arr));
		System.out.println("original String array: "+Arrays.toString(arr1));
		Arrays.sort(arr1);
		System.out.println("sorted String array: "+Arrays.toString(arr1));
	}
}
