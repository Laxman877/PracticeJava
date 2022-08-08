package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("java");
		al.add("php");
		al.add("python");
		al.add("Andorid");
		al.add("Ios");
		
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("cricket");
		al1.add("hockey");
		al1.add("football");
		al1.add("hollyball");
		al1.addAll(al);
		al1.removeAll(al);
		
		Iterator<String> itr = al1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
