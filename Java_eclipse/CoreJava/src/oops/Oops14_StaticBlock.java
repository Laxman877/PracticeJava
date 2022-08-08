package oops;
class StDemo{
	static {
		System.out.println("Calling demo class static block...");
	}
	public StDemo() {
		System.out.println("Cons calling...");
	}
}
public class Oops14_StaticBlock {

	static {
		System.out.println("running static block");
	}
	public static void main(String[] args) {
		System.out.println("running main class...");{
			System.out.println("running non static block...");
		}
		StDemo st=new StDemo();
	}
}
