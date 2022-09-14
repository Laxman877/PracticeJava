package collection;

import java.util.ArrayList;

public class JoinArraylist {
	public static void main(String[] args) {
		ArrayList<String> arr1=new ArrayList<String>();
		arr1.add("java");
		arr1.add("ios");
		arr1.add("android");
		arr1.add("php");
		arr1.add("python");
		System.out.println("list of first array: "+arr1);
		
		ArrayList<String> arr2=new ArrayList<String>();
		arr2.add("java");
		arr2.add("ios");
		arr2.add("php");
		arr2.add("python");
		System.out.println("list of second array: "+arr2);
		ArrayList<String> a=new ArrayList<String>();
		a.addAll(arr1);
		a.addAll(arr2);
		System.out.println("new array: "+a);
	}
}
