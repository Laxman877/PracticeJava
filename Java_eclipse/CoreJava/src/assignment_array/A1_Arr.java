package assignment_array;

import java.util.Arrays;
import java.util.HashSet;

//W.A.J.P to find the common elements between two arrays (string values). 
public class A1_Arr {
	public static void main(String[] args) {
		String []arr1 = {"java","php","python","sql","c++","c#"};
		String []arr2 = {"net","java","c#","cricket","football","sql"};
		
		System.out.println("Array1: "+Arrays.toString(arr1));
		System.out.println("Array2: "+Arrays.toString(arr2));
		
		HashSet<String> set = new HashSet<String>();
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i].equals(arr2[j])) {
					set.add(arr2[j]);
				}
			}
		}
		System.out.println("common element: "+(set));
	}

}
