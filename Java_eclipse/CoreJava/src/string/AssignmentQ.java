package string;

public class AssignmentQ {

	public static void main(String[] args) {
		String s="Sun Rises In East";
		
		char ch[]=s.toLowerCase().toCharArray();
		int vowel=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='a'|| ch[i]=='e'|| ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				vowel++;
			}
		}
		System.out.println("Total vowels : "+vowel);
	}
}
