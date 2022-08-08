package arrays;

import java.util.Arrays;
import java.util.HashSet;

public class CommonElementInTwoArray {
	public static void main(String[] args) {
		String[] arr= {"java","php","python","android"};
		String[] arr1= {"cricket","football","android","php"};
		
		System.out.println("first array: "+Arrays.toString(arr));
		System.out.println("second array: "+Arrays.toString(arr1));
		
		HashSet<String> set=new HashSet<String>();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				if(arr[i].equals(arr1[j])) {
					set.add(arr1[j]);
				}
			}
		}
		System.out.println("common elemnet: "+set);
	}
}
