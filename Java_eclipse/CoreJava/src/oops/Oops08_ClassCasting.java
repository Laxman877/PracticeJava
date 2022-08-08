package oops;
class Animal{
	public void eat() {
		System.out.println("Eating...");
	}
}
class Dog extends Animal{
	public void eat() {
		System.out.println("Eating any thing...");
	}
}
class Cow extends Animal{
	public void eat() {
		System.out.println("Eating grass...");
	}
}
public class Oops08_ClassCasting {
	public static void main(String[] args) {
		//upcasting
		Animal a = new Animal();
		a.eat();
		Animal a1=new Dog();
		Animal a2 =new Cow();
		a1.eat();
		a2.eat();
		//downcasting
		//Dog d1 = (Dog)new Animal();
		//System.out.println(new Dog() instanceof Animal);
		//System.out.println(new Animal() instanceof Dog);
		if(new Animal() instanceof Dog) {
			Dog d1=(Dog)new Animal();
		}else {
			System.out.println("down casting not possible...");
		}
	}
}
