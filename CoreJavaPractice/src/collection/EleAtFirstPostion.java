package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class EleAtFirstPostion {
	public static void main(String[] args) {
		ArrayList<String> string=new ArrayList<String>();
		string.add("red");
		string.add("orange");
		string.add("blue");
		string.add("green");
		System.out.println(string);
		string.add(0,"pink");
		System.out.println(string);
//		Iterator itr=string.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
	}
}
