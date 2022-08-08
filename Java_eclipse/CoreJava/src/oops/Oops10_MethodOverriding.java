package oops;
class X{
	public void run() {
		System.out.println("running run method...");
	}
}
class Y extends X{
	@Override
	public void run() {
		System.out.println("running y class run...");
	}
}
public class Oops10_MethodOverriding {
	public static void main(String[] args) {
		Y y = new Y();
		y.run();
	}
}
