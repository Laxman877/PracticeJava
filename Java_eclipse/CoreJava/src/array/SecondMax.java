package array;

public class SecondMax {
	public static void main(String[] args) {
		int a[]= {10,90,80,40,70,60};
		int max = a[0];
		int sec_max = a[1];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				sec_max = max;
				max = a[i];
			}
			else if(a[i]>sec_max && a[i]!=max) {
				sec_max = a[i];
			}
		}
		System.out.println(" max value is: "+max);
		System.out.println(" sec max value is: "+sec_max);
	}
}
