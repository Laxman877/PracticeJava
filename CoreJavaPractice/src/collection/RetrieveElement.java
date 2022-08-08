package collection;

import java.util.ArrayList;

public class RetrieveElement {
	public static void main(String[] args) {
		ArrayList<String> string=new ArrayList<String>();
		string.add("red");
		string.add("blue");
		string.add("orange");
		string.add("green");
		
		System.out.println(string);
		String element=string.get(0);
		System.out.println("First element: "+element);
		element = string.get(2);
		System.out.println("Third element: "+element);
	}
}
