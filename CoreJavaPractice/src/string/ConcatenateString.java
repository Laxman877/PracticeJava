package string;

public class ConcatenateString {
	public static void main(String[] args) {
		String str1="java excercise and ";
		String str2="php excercise!";
		
		System.out.println("String 1: "+str1);
		System.out.println("String 2: "+str2);
		
		//cancatenate two String 
		String str3=str1.concat(str2);
		
		System.out.println("String 3: "+str3);
	}
}
