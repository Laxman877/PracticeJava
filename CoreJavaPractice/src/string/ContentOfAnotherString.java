package string;

public class ContentOfAnotherString {
	public static void main(String[] args) {
		String str1="Red is my favorite color.";
		String str2="Orange is also my favorite color.";
		
		//the string to check if they start with this
		String str="Red";
		
		//do either of the first two strin starts with str
		boolean start1=str1.startsWith(str);
		boolean start2=str2.startsWith(str);
		
		//display the result
		System.out.println(str1+" starts with "+str+"? "+start1);
		System.out.println(str2+" starts with "+str+"? "+start2);
	}
}
