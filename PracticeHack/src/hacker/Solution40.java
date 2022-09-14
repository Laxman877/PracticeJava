package hacker;

import java.lang.reflect.Method;

class Printer{
	public void printArray(Object[] obj) {
		for(int i=0;i<obj.length;i++) {
			System.out.println(obj[i]);
		}
	}
}
public class Solution40 {
	public static void main(String[] args) {
		Printer myPrinter=new Printer();
		Integer intarray[]= {1, 2 , 3};
		String stringarray[]= {"hello","world"};
		myPrinter.printArray(intarray);
		myPrinter.printArray(stringarray);
		int count =0;
		for(Method method : Printer.class.getDeclaredMethods()) {
			String name=method.getName();
			
			if(name.equals("printArray"))
				count++;
		}
		if(count>1)
			System.out.println("Method overloading is not allowed!");
	}
}
