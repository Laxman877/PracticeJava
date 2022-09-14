package collection; 

import java.util.HashMap;

public class MapToCheckKeyValue {
	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "red");
		map.put(2, "pink");
		map.put(3, "orange");
		map.put(4, "yellow");
		
		boolean result=map.isEmpty();
		System.out.println("Is hashmap is empty: "+result);
		
		map.clear();
		
		result=map.isEmpty();
		
		System.out.println("Is hashmap is empty: "+result);
	}
}
