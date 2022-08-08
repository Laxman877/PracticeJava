package assignment_array;
//W.A.J.P to test if an array contains a specific value. 

public class B14_Arr {
	public static boolean contains(int[] arr , int item) {

		for(int n: arr) {
			if(item==n) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[] arr1= {1996,1983,1976,2014,2019,2001,4017};
		
		System.out.println(contains(arr1,4019));
		System.out.println(contains(arr1,1976));
		
	}

}
