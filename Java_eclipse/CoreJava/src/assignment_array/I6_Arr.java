package assignment_array;
//w.a.j.p to find the duplicate values of an array of string values.
public class I6_Arr {
	public static void main(String[] args) {
		String []arr= {"abc","def","ghi","jkl","mno","def","pqr","jkl","mno"};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if((arr[i].equals(arr[j])) && (i!=j)) {
					System.out.println("duplicate element: "+arr[j]);
				}
			}
		}
	}

}
