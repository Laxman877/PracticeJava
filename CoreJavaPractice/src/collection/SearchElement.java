package collection;

import java.util.ArrayList;

public class SearchElement {
	public static void main(String[] args) {
		ArrayList<String> string=new ArrayList<String>();
		string.add("red");
		string.add("orange");
		string.add("blue");
		string.add("green");
		string.add("white");
		if(string.contains("green")) {
			System.out.println("Found The element");
		}else {
			System.out.println("There is no such element");
		}
	}
}
