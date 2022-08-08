package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
		//initial size = 16;
		//load factor=0.75;
		//does not allowed duplication
		//1 null value allowed
		//store data in random manner
		HashSet<String> sh = new HashSet<String>();
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
