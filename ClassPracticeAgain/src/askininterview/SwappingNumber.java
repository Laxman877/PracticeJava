package askininterview;

public class SwappingNumber {
	public static void main(String[] args) {
		int a=10, b=20;
		System.out.println("Before swapping values: "+a+" "+b);
		//logic 1- Third variable
		
//		  int t=a; 
//		  a=b; 
//		  b=t;
		 
		//logic 2-use + & - operator without using third variable
		
//		  a=a+b; //10+20=30
//		  b=a-b; //30-20=10
//		  a=a-b;//30-10=20
		 
		//logic 3-use * & / opeartor without using third variable
		//here a & b value should not be zero
		
//		  a=a*b; //10*20=200
//		  b=a/b; //200/20=10
//		  a=a/b;//200/10=20
		 
		//logic 4-bitwise XOR(^)
		
//		  a=a^b; //10^20=30
//		  b=a^b; //30^20=10
//		  a=a^b;//30^10=20
		 
		//logic 5-single statement
		b=a+b-(a=b);//
		System.out.println("After Swapping Values: "+a+" "+b);
	}
}
