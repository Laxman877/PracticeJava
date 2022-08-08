package assignment_array;

import java.util.Arrays;

//W.A.J.P to compute the average value of an array of integers except the largest and smallest values.
public class A2_Arr {
	public static void main(String[] args) {
		int []arr_num= {5,7,6,3,8,9};
		System.out.println("original array: "+Arrays.toString(arr_num));
		int max= arr_num[0];
		int min=arr_num[0];
		float sum = arr_num[0];
		for(int i=1;i<arr_num.length;i++) {
			sum+=arr_num[i];
			if(arr_num[i]>max)
				max = arr_num[i];
			else if(arr_num[i]<min)
				min= arr_num[i];
		}
		float x=((sum-max-min)/(arr_num.length-2));
		System.out.printf("compute the average value of an array of integers except the largest and smallest values: %.2f",x);
		System.out.print("\n");
	}

}
