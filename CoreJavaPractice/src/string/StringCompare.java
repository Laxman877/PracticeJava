package string;

public class StringCompare {
	public static void main(String[] args) {
		String str1="example.com", str2="Example.com";
		CharSequence cs="Example.com";
		System.out.println("Comparing "+str1+" and "+cs+": "+str1.equals(cs));
		System.out.println("Comparing "+str2+" and "+cs+": "+str2.equals(cs));
	}
}
