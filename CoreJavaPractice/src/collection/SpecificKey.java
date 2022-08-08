package collection;

import java.util.HashMap;
import java.util.Map;

public class SpecificKey {
	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "blue");
		map.put(2, "red");
		map.put(3, "orange");
		map.put(4, "green");
		map.put(5, "white");
		for(Map.Entry x: map.entrySet()) {
			System.out.println(x.getKey()+" "+x.getValue());
		}
		System.out.println("Mapping size: "+map.size());
	}
}
