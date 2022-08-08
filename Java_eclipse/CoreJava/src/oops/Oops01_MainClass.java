package oops;
class Pen{
	int price = 10;
	static String colour = "Blue";
	String company = "ballpoint";
	
	public void towrite(){
		System.out.println(price+" "+colour+" "+company);
	}
	public static void display() {
		System.out.println("running display...");
	}
}
public class Oops01_MainClass {
	public static void main(String[] args) {
		System.out.println("programe started..");
		Pen p = new Pen();
		p.towrite();
		Pen p1 = new Pen();
		p1.towrite();
		
		Pen.display();
		
	}

}
