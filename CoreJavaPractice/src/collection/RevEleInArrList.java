package collection;

import java.util.ArrayList;
import java.util.Collections;

public class RevEleInArrList {
	public static void main(String[] args) {
		ArrayList<String> string =new ArrayList<String>();
		string.add("java");
		string.add("php");
		string.add("python");
		string.add("android");
		System.out.println("List before reversing :\n"+string);
		Collections.reverse(string);
		System.out.println("List after reversing :\n"+string);
	}
}
