package Assignment;
//program for vowel or consonant
import java.util.Scanner;
public class Char {
	public static void main(String[] args) {
		int i =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character: ");
		char ch = sc.next().charAt(0);
		switch(ch) {
		case 'a' :
		case 'e' :
		case 'i' :
		case 'o' :
		case 'u' :
		case 'A' :
		case 'E' :
		case 'I' :
		case 'O' :
		case 'U' : 
			i++;
		}
		if(i==1) {
			System.out.println("Entered character "+ch+" is vowel");
		}else if((ch>='a'&& ch<='z')||(ch>='A'&&ch<='Z')) {
				System.out.println("Entered character "+ch+" is cosonant");
			}else {
				System.out.println("not an alfabet");
			}
		}
}
