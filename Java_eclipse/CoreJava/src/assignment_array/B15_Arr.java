package assignment_array;
//W.A.J.P to find the index of an array element. 
public class B15_Arr {
	public static int findIndex(int[] arr, int t) {
		if(arr==null) return -1;
		int len = arr.length;
		int i=0;
		while(i<len) {
			if(arr[i]==t) return i;
			else i=i+1;
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[]= {25,35,66,14,19,88,12,32,45};
		System.out.println("index position of 14: "+findIndex(arr, 14));
		System.out.println("index position of 12: "+findIndex(arr, 12));
	}

}
