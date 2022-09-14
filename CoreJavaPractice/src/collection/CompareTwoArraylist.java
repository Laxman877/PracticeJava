package collection;

import java.util.ArrayList;

public class CompareTwoArraylist {
	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("java");
		a1.add("php");
		a1.add("python");
		a1.add("android");
		a1.add("ios");
		System.out.println(a1);
		ArrayList<String> a2=new ArrayList<String>();
		a2.add("java");
		a2.add("galaxy");
		a2.add("solaris");
		a2.add("meteors");
		a2.add("ios");
		System.out.println(a2);
		ArrayList<String> a3=new ArrayList<String>();
		for(String s:a1) 
			a3.add(a2.contains(s) ? "yes":"no");
			
		System.out.println("same content is on same index: "+a3);
	}
}
