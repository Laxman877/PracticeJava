package Basics;
//program for 2nd large number
public class Arr2ndLarge {
	public static void main(String[] args) {
		int a[]= {55,12,80,65,41,};
		int max=a[0];
		int max2 =a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		for(int i=0;i<a.length;i++) {
			if((a[i]>max2) && (a[i]!=max)) {
				max2=a[i];
			}
		}
		System.out.println(max2);
	}
}
