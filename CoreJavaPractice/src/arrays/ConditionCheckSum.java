package arrays;

import java.util.Arrays;

public class ConditionCheckSum {
	public static void main(String[] args) {
		int []arr_num= {10,54,10,-74,58,11};
		System.out.println("original array: "+Arrays.toString(arr_num));
		int search_num=10;
		int fixed_sum=30;
		System.out.println("Result: "+result(arr_num, search_num, fixed_sum));
	}
	public static boolean result(int[] numbers,int search_num,int fixed_sum) {
		int temp_sum=0;
		for(int number:numbers) {
			if(number==search_num) {
				temp_sum+=search_num;
			}
			if(temp_sum>fixed_sum) {
				break;
			}
		}
		return temp_sum==fixed_sum;
	}
}
