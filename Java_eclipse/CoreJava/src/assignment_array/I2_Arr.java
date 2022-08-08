package assignment_array;

import java.util.Arrays;

//W.A.J.P to copy an array by iterating the array.
public class I2_Arr {
	public static void main(String[] args) {
		int []arr= {14,25,32,51,45,65,48,14,15,85};
		int []arr1=new int[10];
		
		System.out.println("source array: "+Arrays.toString(arr));
		
		for(int i=0; i<arr.length;i++) {
			arr1[i]=arr[i];
		}
		System.out.println("new array: "+Arrays.toString(arr1));
	}

}
