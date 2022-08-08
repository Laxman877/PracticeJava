package assignment_array;

import java.util.Arrays;

//W.A.J.P to sort a numeric array and a string array. 
public class B11_Arr {
	public static void main(String[] args) {
		int arr[]= {9,5,1,2,4,6,7,3,8};
		String arr1[]={"java","python","c#","php","c programing","c++"};
		
		System.out.println("Original numeric array: "+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("sorted numeric array: "+Arrays.toString(arr));
		System.out.println("Original string array: "+Arrays.toString(arr1));
		Arrays.sort(arr1);
		System.out.println("sorted string array: "+Arrays.toString(arr1));
	}

}
