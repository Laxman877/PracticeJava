package assignment_array;
//W.A.J.P to find the duplicate values of an array of integer values. 
public class I5_Arr {
	public static void main(String[] args) {
		int []arr= {2,3,5,1,8,5,3,4,8};
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if((arr[i]==arr[j])&& (i!=j)) {
					System.out.println("duplicate element: "+arr[j]);
				}
			}
		}
	}

}
