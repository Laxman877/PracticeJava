package string;

public class SecMstFreqCharString {
	static final int No_OF_CHARS =256;
	static char get2ndMostFreq(String str1){
		int[] ctr=new int[No_OF_CHARS];
		int i;
		for(i=0;i<str1.length();i++) 
			(ctr[str1.charAt(i)])++;
			int ctr_first=0,ctr_second=0;
			for(i=0;i<No_OF_CHARS;i++) {
				if(ctr[i]>ctr[ctr_first]) {
					ctr_second=ctr_first;
					ctr_first=i;
				}else if(ctr[i]>ctr[ctr_second] && ctr[i]!=ctr[ctr_first])
					ctr_second=i;
			}
		return (char) ctr_second;
	}
	public static void main(String[] args) {
		String str1="successes";
		System.out.println("The given String is: "+str1);
		char res=get2ndMostFreq(str1);
		if(res!='\0')
			System.out.println("The Second most frequent char in the string is: "+res);
		else
			System.out.println("No second most frequent char found in this string.");
	}
}
