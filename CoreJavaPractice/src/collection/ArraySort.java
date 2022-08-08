package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArraySort {
	public static void main(String[] args) {
		ArrayList<String> string=new ArrayList<String>();
		string.add("red");
		string.add("orange");
		string.add("blue");
		string.add("white");
		string.add("green");
		System.out.println("List before sorting: "+string);
		Collections.sort(string);
		System.out.println("List after sorting: "+string);
	}
}
