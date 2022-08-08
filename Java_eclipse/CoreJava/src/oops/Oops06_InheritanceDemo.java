package oops;
class A{
	int i=10;
	public void display() {
		System.out.println("running class a display method...");
	}
}

class B extends A {
	int i=50;
	public void run() {
		int i=70;
		System.out.println("i: "+i);
		System.out.println("i: "+this.i);
		System.out.println("i: "+super.i);
	}
	public void display() {
		System.out.println("running class b display method...");
		super.display();
	}
}
class C extends B{
	
}
public class Oops06_InheritanceDemo {
	public static void main(String[] args) {
		B b=new B();
		b.display();
		b.run();
		
		A a=new A();
		a.display();
	}
}
