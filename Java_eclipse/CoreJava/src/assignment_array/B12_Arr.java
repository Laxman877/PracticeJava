package assignment_array;
//W.A.J.P to sum values of an array. 
public class B12_Arr {
	public static void main(String[] args) {
		
		int arr[]= {3,5,6,7,8,9,10,15,};
		int sum=0;
		for(int i : arr)
			sum+=i;
		System.out.println("the sum of an array is: "+sum);
	}

}
