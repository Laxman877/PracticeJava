package arrays;

public class SecondMaxValueOfArray {
	public static void main(String[] args) {
		int[] arr= {10,30,25,74,96,47,85,89};
		int max=arr[0];
		int sec_max=arr[1];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				sec_max=max;
				max=arr[i];
			}
			else if(arr[i]>sec_max && arr[i]!=max) {
				sec_max=arr[i];
			}
			
		}
		System.out.println("largest value is: "+max);
		System.out.println("second largest value is: "+sec_max);
	}
}
