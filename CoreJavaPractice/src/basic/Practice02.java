package basic;

public class Practice02 {
	public static void main(String[] args) {
		int i='A';
		System.out.println(i);
		
		char c =70;
		System.out.println(c);
		
		//widening or implicite
		int a=20;
		long a1=a;
		System.out.println(a1);
		//narrowing or explicite
		long b = 5892;
		int b1=(int) b;
		System.out.println(b1);
	}
}
