package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class UpdateElement {
	public static void main(String[] args) {
		ArrayList<String> string=new ArrayList<String>();
		string.add("red");
		string.add("orange");
		string.add("blue");
		string.add("green");
		
		System.out.println(string);
		string.set(2, "yellow");
		Iterator itr=string.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
