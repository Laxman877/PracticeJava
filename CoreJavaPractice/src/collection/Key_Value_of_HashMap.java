package collection;

import java.util.HashMap;

public class Key_Value_of_HashMap {
	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "blue");
		map.put(2, "red");
		map.put(3, "orange");
		map.put(4, "green");
		map.put(5, "white");
		System.out.println("The size of hashmap is: "+map.size());
	}
}
