package oops;
interface I1{
	int a=10;
	void display();
}
interface I2 extends I1{
	public void run();
}
class Abc{
	
}
class Impl extends Abc implements I1,I2{
	public void display() {
		System.out.println("running display...");
	}
	
	public void run() {
		
	}
}
public class Oops12_InterfaceDemo {
	public static void main(String[] args) {
		Impl i = new Impl();
		i.display();
	}
}
