package collection;

import java.util.HashSet;
import java.util.Iterator;

public class IterateHashList {
	public static void main(String[] args) {
		HashSet<String> HSet=new HashSet<String>();
		HSet.add("black");
		HSet.add("red");
		HSet.add("orange");
		HSet.add("pink");
		HSet.add("white");
		Iterator<String> itr=HSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
