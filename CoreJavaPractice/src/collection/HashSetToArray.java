package collection;

import java.util.HashSet;

public class HashSetToArray {
	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		set.add("java");
		set.add("pho");
		set.add("ios");
		set.add("android");
		set.add("python");
		System.out.println("original hashset : "+set);
		
		String new_arr[]=new String[set.size()];
		set.toArray(new_arr);
		System.out.println("Array element: ");
		for(String element:new_arr) {
			System.out.println(element);
		}
	}
}
