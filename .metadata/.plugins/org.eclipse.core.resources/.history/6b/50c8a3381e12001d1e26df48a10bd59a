package string;
class Main{
	public String wordReplacedBy(String stng) {
		String newstring="";
		int l=stng.length();
		for(int i=0;i<l;i++) {
			if(i-1>0 && Character.isLetter(stng.charAt(i-1)) || i+2<l && Character.isLetter(stng.charAt(i+2))) {
				newstring+=stng.charAt(i);
			}else if(i+1<l && stng.substring(i,i+2).equals("is")) {
				newstring+="is not";
				i++;
			}else newstring+=stng.charAt(i);
		}return newstring;
	}
}
public class WordReplaceString {
	public static void main(String[] args) {
		Main main=new Main();
		String str1="it is a string";
		System.out.println("The given string is: "+str1);
		System.out.println("The newstring is: "+main.wordReplacedBy(str1));
	}
}
