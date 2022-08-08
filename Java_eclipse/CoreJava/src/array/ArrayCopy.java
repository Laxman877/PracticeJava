package array;

public class ArrayCopy {
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60,70};
		int b[]= new int[10];
		System.arraycopy(a,2,b,3,4);
		for(int i=0;i<a.length;i++) {
			System.out.println(b[i]);
		}
	}
}
