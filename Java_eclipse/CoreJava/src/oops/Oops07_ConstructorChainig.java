package oops;
class P{
	P(){
		System.out.println("running p class cons...");
	}
}
class Q extends P{
	Q(){
		super();
		System.out.println("running Q class cons...");
	}
	Q(int id){
		this();
		System.out.println("id: "+id);
	}
	Q(String name){
		this(10);
		System.out.println("name: "+name);
	}
}
class R extends Q{
	R(){
		super("Tops");
		System.out.println("running r class cons...");
	}
}
public class Oops07_ConstructorChainig {
	public static void main(String[] args) {
		R r =new R();
	}
}
