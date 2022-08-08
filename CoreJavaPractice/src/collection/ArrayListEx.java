package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<String> string=new ArrayList<String>();
		string.add("red");
		string.add("orange");
		string.add("blue");
//		System.out.println(string);
		Iterator itr=string.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
