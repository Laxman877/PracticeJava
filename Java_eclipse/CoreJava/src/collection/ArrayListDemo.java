package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		//initial size = 10;
		//new size = old*3/2=1;
		//preserved order
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(30);
		al.add(45);
		al.add("myname");
		al.add("java");
		al.add(12.23);
		al.add(87.12);
		al.add(null);
		
		System.out.println("size: "+al.size());
		System.out.println(al.get(5));
		al.remove(6);
		al.set(3, 30);
		al.add(2,85);
		al.add(5,"sum");
		
		System.out.println("size: "+al.size());

		
//		for(Object o : al) {
//			System.out.println(o);
//		}
		Iterator  itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
