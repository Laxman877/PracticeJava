package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashsetDemo {
	public static void main(String[] args) {
		//preserved insertion order
		LinkedHashSet<String> sh = new LinkedHashSet<String>();
		sh.add("java");
		sh.add("php");
		sh.add("android");
		sh.add("python");
		sh.add("Ios");
		
		Iterator<String> itr = sh.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
