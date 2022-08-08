package assignment1;
//Write a Java program to count the letters, spaces, numbers and other characters of an input string.

public class B26 {

	public static void main(String[] args) {
		String s = "how are you? how is going your java prparation? for 150 days";
		count(s);
		
	}
	public static void count(String x) {
		char[]ch =x.toCharArray();
		int letter =0;
		int space =0;
		int num=0;
		int other=0;
		for(int i=0;i<x.length();i++) {
			if(Character.isLetter(ch[i])) {
				letter++;
				
			}else if(Character.isDigit(ch[i])) {
				num++;
			}
			else if(Character.isSpaceChar(ch[i])) {
				space++;
			}else {
				other++;
			}
		}
		System.out.println("how are you? how is going your java prparation? for 150 days");
		System.out.println("letters: "+letter);
		System.out.println("space: "+space);
		System.out.println("numbers: "+num);
		System.out.println("othrs: "+other);
	}
}
