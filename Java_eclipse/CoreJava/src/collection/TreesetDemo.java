package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetDemo {
	public static void main(String[] args) {
		//store data in acd and dscd order
		TreeSet sh = new TreeSet();
		sh.add("java");
		sh.add("php");
		sh.add("python");
		sh.add("android");
		sh.add("Ios");
		
//		Iterator<String> itr = sh.iterator();
		Iterator<String> itr = sh.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
