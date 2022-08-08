package array;

public class ArrayOperation {
	public static void main(String[] args) {
		int a[]= {10,200,20,35,150,85,47};
		int sum=0;
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			sum += a[i];
			if(a[i]>max) {
				max = a[i];
				
			}
			if(a[i]<min) {
				min = a[i];
				
			}
			
		}
		System.out.println("sum is: "+sum);
		System.out.println("avg is: "+(sum/a.length));
		System.out.println("max is: "+max);
		System.out.println("min is: "+min);
	}
}
