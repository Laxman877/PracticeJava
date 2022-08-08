package Basics;
public class MergeArr {
	public static void main(String [] args) {
		int a[]= {10,20,30,40,50};
		int b[]= {1,2,3,4,5};
		int sum = a.length + b.length;
		int c[] = new int[sum];
		
		
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
			//System.out.println(c[i]);
		}
		for(int i=0;i<b.length;i++) {
			c[a.length+i]=b[i];
			//System.out.println(c[i]);
		}
		for(int i=0;i<sum;i++) {
			System.out.print(c[i]+" ");
		}
	}
}