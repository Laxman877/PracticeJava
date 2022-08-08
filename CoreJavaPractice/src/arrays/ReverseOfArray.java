package arrays;

import java.util.Arrays;

public class ReverseOfArray {
	public static void main(String[] args) {
		int[] arr= {1485, 3456, 9654, 3214, 5478,
				    1245, 3452, 6584, 6241, 3145,
				    1456, 2165, 1457, 2546};
		System.out.println("Original Array : "+Arrays.toString(arr));
		
		for(int i=0;i<arr.length/2;i++) {
			int temp=arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
			
		}
		System.out.println("reverse array: "+Arrays.toString(arr));
	}
}
