package assignment_array;

import java.util.Arrays;

//W.A.J.P to insert an element (specific position) into an array. 
public class I3_Arr {
	public static void main(String[] args) {
		int []arr= {12,23,15,24,16,18,75,96,47,63};
		
		int ind_position = 2;
		int newValue= 65;
		
		System.out.println("original array: "+Arrays.toString(arr));
		
		for(int i=arr.length-1;i>ind_position;i--) {
			arr[i]=arr[i-1];
			
		}
		arr[ind_position]=newValue;
		System.out.println("new array: "+Arrays.toString(arr));
	}

}
