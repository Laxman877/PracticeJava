package hacker;

import java.util.Scanner;
import java.util.Stack;

public class Solution38 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter..");
		while(sc.hasNext()) {
			String in=sc.next();
			Stack<String> stack=new Stack<String>();
			for(int i=0;i<in.length();i++) {
				String currentChar=in.substring(i,i+1);
				 if (currentChar.equals("[") || currentChar.equals("(") || currentChar.equals("{"))
					 stack.push(currentChar);
				 else if (currentChar.equals("}") && stack.isEmpty() == false){
					 if(stack.peek().equals("{"))
						 stack.pop();
				 }
				 else if (currentChar.equals(")") && stack.isEmpty() == false){
	                    
	                    if (stack.peek().equals("("))
	                        stack.pop();
	                }
				 else if (currentChar.equals("]") && stack.isEmpty() == false){
	                    
	                    if (stack.peek().equals("["))
	                        stack.pop();
	                }
				 else
	                	stack.push(currentChar);
			}
			if (stack.isEmpty())
                System.out.println("true");
            else
               System.out.println("false"); 
		}
	}
}
