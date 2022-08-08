package oops;

public class Oops05_Encapsulation {
	public static void main(String[] args) {
		Sample s= new Sample();
		s.setId(10);
		System.out.println(s.getId());
		
		s.setName("Tops");
		System.out.println(s.getName());
		
		s.setClg("SSVPS");
		System.out.println(s.getClg());
	}
}
