package string;

public class WrapperClassDemo {

	public static void main(String[] args) {
		int i=10;
		//boxing
		Integer i1 = new Integer(i);
		//autoboxing
		Integer i2 = i;
		
		Integer a=10;
		//unboxing
		int a1 =a.intValue();
		//auto unboxing
		int a2 = a;
		
	}
}
