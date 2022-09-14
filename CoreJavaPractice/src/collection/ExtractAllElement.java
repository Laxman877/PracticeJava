package collection;

import java.util.ArrayList;
import java.util.List;

public class ExtractAllElement {
	public static void main(String[] args) {
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("java");
		arr.add("php");
		arr.add("python");
		arr.add("ios");
		arr.add("android");
		System.out.println("original list: "+arr);
		List<String> sub_list=arr.subList(0, 3);
		System.out.println("list of first three element: "+sub_list);
	}
}
