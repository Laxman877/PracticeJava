package string;

public class ContentCheckString {
	public static void main(String[] args) {
		String str1="Python excercises";
		String str2="java excercise";
		
		//the above two string if they end with se
		String end_str="se";
		
		//check first two string end with end_str
		boolean end1=str1.endsWith(end_str);
		boolean end2=str2.endsWith(end_str);
		
		//display the result of the end with calls.
		System.out.println("\""+str1+"\" ends with "+"\""+end_str+"\"/"+end1);
		System.out.println("\""+str2+"\" ends with "+"\""+end_str+"\"/"+end2);
	}
}
