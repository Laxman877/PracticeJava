package arrays;

public class DuplicateValueOfArray2 {
	public static void main(String[] args) {
		String [] arr= {"abc","def","ghi","jkl","mno","def","pqr","jkl","mno"};
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if((arr[i]==arr[j])&& (i!=j)) {
					System.out.println("duplicate element of array: "+arr[j]);
				}
			}
		}
	}
}
