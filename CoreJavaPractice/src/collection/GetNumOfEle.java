package collection;

import java.util.HashSet;

public class GetNumOfEle {
	public static void main(String[] args) {
		HashSet<String> hset=new HashSet<String>();
		hset.add("red");
		hset.add("orange");
		hset.add("blue");
		hset.add("white");
		hset.add("green");
		System.out.println("The Original Hashset is: "+hset);
		System.out.println("Size of the hashset is: "+hset.size());
	}
}
