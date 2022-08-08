package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateEle {
	public static void main(String[] args) {
		ArrayList<String> string =new ArrayList<String>();
		string.add("red");
		string.add("orange");
		string.add("blue");
		string.add("white");
		
//		for(String element:string) {
//			System.out.println(element);
//		}
		Iterator itr=string.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
