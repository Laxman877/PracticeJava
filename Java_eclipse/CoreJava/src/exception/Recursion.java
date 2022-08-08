package exception;
class Demo{
	public void square(int a) {
		int sq=a*a;
		System.out.println("square of "+a+" is: "+sq);
		a++;
		if(a<20) {
			square(a);
		}
	}
}
public class Recursion {

	public static void main(String[] args) {
		Demo d=new Demo();
		d.square(2);
	}
}
