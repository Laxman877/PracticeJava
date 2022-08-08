package askininterview;

public class ReverseString {
	public static void main(String[] args) {
		//1 String concatenation
		String str="ABCD";
		String rev="";
		/*int len=str.length();//4
		
		for(int i=len-1;i>=0;i--) {//3 2 1 0 -1
			rev=rev+str.charAt(i);//D C B A
		}
		System.out.println("Reverse String is: "+rev);*/
		
		//2using character array
		/*char a[]=str.toCharArray();
		int len=str.length();
		for(int i=len-1;i>=0;i--) {//3 2 1 0 -1
			rev=rev+a[i];//DCBA
		}
		System.out.println("Reverse String is: "+rev);*/
		
		//3 using stringbuffer class
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
	}
}
