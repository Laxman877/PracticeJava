package collection;

import java.util.ArrayList;
import java.util.Collections;

public class CopyArray {
	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		list1.add("4");
		System.out.println("List1: "+list1);
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("A");
		list2.add("B");
		list2.add("c");
		list2.add("D");
		System.out.println("List2: "+list2);
		
		Collections.copy(list2, list1);
		System.out.println("Copy list1 to list2,\nAfter copy: ");
		System.out.println("List1: "+list1);
		System.out.println("List2: "+list2);
	}
}
