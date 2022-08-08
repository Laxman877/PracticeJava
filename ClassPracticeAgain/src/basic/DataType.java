package basic;
//data types conversion
public class DataType {
	public static void main(String[] args) {
		int i='A';
		System.out.println(i);
		
		char c=70;
		System.out.println(c);
		
		//widening
		//implicite
		int a=20;
		long a1=a;
		System.out.println(a1);
		//nerrowing
		//explicite
		long b=5892;
		int b1=(int)b;
		System.out.println(b1);
	}
}
