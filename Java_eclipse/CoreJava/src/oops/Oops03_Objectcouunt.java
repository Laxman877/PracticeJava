package oops;
class Demo{
	static int count = 0;
	public Demo() {
		count++;
		System.out.println("Object no: "+count);
	}
	public static void display() {
		System.out.println("Total no of object: "+count);
	}
}
public class Oops03_Objectcouunt {
	public static void main(String[] args) {
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		Demo d3 = new Demo();
		Demo d4 = new Demo();
		Demo.display();
		
	}

}
