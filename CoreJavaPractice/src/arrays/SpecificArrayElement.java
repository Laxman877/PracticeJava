package arrays;

public class SpecificArrayElement {
	public static boolean contains(int []arr,int items) {
		for(int i:arr) {
			if(items==i) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int arr[]= {1996,1975,1947,2014,3022,1998};
		System.out.println(contains(arr, 3021));
		System.out.println(contains(arr, 2014));
	}
}
