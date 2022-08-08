package arrays;

import java.util.Arrays;

public class CylindricallyRotateArr {
	static int arr[]=new int[] {10,20,30,40,50,60};
	static void rotate_array() {
		int a=arr[arr.length-1],i;
		for(i=arr.length-1;i>0;i--) 
			arr[i]=arr[i-1];
		arr[0]=a;
	}
	public static void main(String[] args) {
		System.out.println("Original Array: ");
		System.out.println(Arrays.toString(arr));
		rotate_array();
		System.out.println("Rotated Array: ");
		System.out.println(Arrays.toString(arr));
	}
}
