package string;

public class NonRepeatCharInString {
	public static void main(String[] args) {
		String str="gibblegabbler";
		System.out.println("The given String is: "+str);
		for(int i=0;i<str.length();i++) {
			boolean uniuqe=true;
			for(int j=0;j<str.length();j++) {
				if(i!=j && str.charAt(i)==str.charAt(j)) {
					uniuqe=false;
					break;
				}
			}
			if(uniuqe) {
				System.out.println("The non repeating char in string is: "+str.charAt(i));
				break;
			}
		}
	}
}
