package hacker;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

public class Solution30 {
	public static void main(String[] args) {
		Class student=Student.class;
		Method[] methods=student.getDeclaredMethods();
		
		ArrayList<String> methodlist=new ArrayList<>();
		for(Method m : methods) {
			methodlist.add(m.getName());
		}
		Collections.sort(methodlist);
		for(String name : methodlist) {
			System.out.println(name);
		}
	}
}
