package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleElement {
	public static void main(String[] args) {
		ArrayList<String> string = new ArrayList<String>();
		string.add("red");
		string.add("blue");
		string.add("green");
		string.add("orange");
		string.add("white");
		
		System.out.println("List before shuffling:\n"+string);
		Collections.shuffle(string);
		System.out.println("List after shuffling:\n"+string);
	}
}
