package arrays;

public class SumOfArray {
	public static void main(String[] args) {
		int arr[]= {78,12,52,34,68};
		int sum=0;
		for(int i:arr)
			sum+=i;
		System.out.println("sum of the array: "+sum);
	}
}
