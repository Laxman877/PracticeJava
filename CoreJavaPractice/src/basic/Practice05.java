package basic;

public class Practice05 {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c;
		int num=10;
		System.out.println(a+" "+b);
		for(int i=3;i<=num;i++) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}
}
