package collection;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack st = new Stack();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		
		System.out.println(st.pop());
		System.out.println("***after pop***");
		for(Object o: st) {
			System.out.println(o);
		}
		System.out.println("******");
		System.out.println(st.peek());
		System.out.println("***after peek***");
		for(Object o : st) {
			System.out.println(o);
		}
	}

}
