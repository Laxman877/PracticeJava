package oops;
class Student{
	public Student(){
		System.out.println("Constructor calling...");
	}
	int id;
	String name;
	static String collage ="SVNIT";
	public Student(int a,String b) {
		id = a;
		name = b;
	}
	public void display() {
		System.out.println(id+" "+name+" "+collage);
	}
}
public class Oops02_Mainclass {
	public static void main(String[] args) {
		Student st = new Student(10,"Tops");
		st.display();
		Student st1=new Student(20,"Parth");
		st1.display();
		Student st3 = new Student();
		
	}

}
