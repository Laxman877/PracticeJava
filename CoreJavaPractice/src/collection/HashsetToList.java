package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashsetToList {
	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		set.add("java");
		set.add("pho");
		set.add("ios");
		set.add("android");
		set.add("python");
		System.out.println("original hashset : "+set);
		
		List<String> list=new ArrayList<String>(set);
		System.out.println("list of set : "+list);
	}
}
