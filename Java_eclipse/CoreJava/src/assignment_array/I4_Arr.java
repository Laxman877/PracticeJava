package assignment_array;

import java.util.Arrays;

//W.A.J.P to reverse an array of integer values. 
public class I4_Arr {
	public static void main(String[] args) {
		 int[] arr = {
		            1789, 2035, 1899, 1456, 2013, 
		            1458, 2458, 1254, 1472, 2365, 
		            1456, 2165, 1457, 2456};
		 
		 System.out.println("original array: "+Arrays.toString(arr));
		 
		 for(int i=0;i<arr.length/2;i++) {
			 int temp = arr[i];
			 arr[i]=arr[arr.length-i-1];
			 arr[arr.length-i-1]=temp;
			 
		 }
		 System.out.println("reverse array: "+Arrays.toString(arr));
	}

}
