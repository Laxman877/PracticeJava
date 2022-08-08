package arrays;

import java.util.Arrays;

public class ArraySegregate {
	public static void main(String[] args) {
		int []nums= {0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1};
		int i,num_size=nums.length;
		int left=0,right=num_size-1;
		System.out.println("Original Array: "+Arrays.toString(nums));
		
		while(left<right) {
			//while 0 at left increament left index
			while(nums[left]==0 && left<right) 
				left++;
				
			//while we see 1 at right decrement rught index
			while(nums[right]==1 && left<right)
				right--;
			
			if(left<right) {
				nums[left]=0;
				nums[right]=1;
				left++;
				right--;
				
			}
		}
		System.out.println("Array After Segregation is: "+Arrays.toString(nums));
	}
}
