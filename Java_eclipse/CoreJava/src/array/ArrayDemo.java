package array;

public class ArrayDemo {
	public static void main(String[] args) {
		int a[]=new int[10];
		a[0]=20;
		a[5]=50;
		int b[]= {10,20,30,40,50,60,70};
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		String sub[]= {"java","php","python"};
		for(int i=0;i<a.length;i++) {
			System.out.println(sub[i]);
		}
		
	}
}
