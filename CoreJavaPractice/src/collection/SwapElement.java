package collection;

import java.util.ArrayList;
import java.util.Collections;

public class SwapElement {
	public static void main(String[] args) {
		ArrayList<String> c1=new ArrayList<String>();
		c1.add("yellow");
		c1.add("red");
		c1.add("blue");
		c1.add("orange");
		c1.add("pink");
		
		System.out.println("Arraylist Before swap : ");
		for(String a:c1) {
			System.out.println(a);
		}
		Collections.swap(c1, 0,	2);
		System.out.println("Arraylist after swap : ");
		for(String b:c1) {
			System.out.println(b);
		}
	}
}
