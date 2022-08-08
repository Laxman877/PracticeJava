package string;

public class DuplicateCharInString {
	static final int max_chars=256;
	static void CountCharacters(String str1, int[] ctr) {
		for(int i=0;i<str1.length();i++) 
			ctr[str1.charAt(i)]++;
	}
	static void showDuplicate(String str1) {
		int ctr[]=new int[max_chars];
		CountCharacters(str1, ctr);
		for(int i=0;i<max_chars;i++) 
			if(ctr[i]>1)
				System.out.printf("%c appears %d times\n",i,ctr[i]);
	}
	public static void main(String[] args) {
		String str1="w3resource tops technologies";
		System.out.println("The given String is: "+str1);
		System.out.println("The duplicate Characters and count are: ");
		showDuplicate(str1);
	}
}
