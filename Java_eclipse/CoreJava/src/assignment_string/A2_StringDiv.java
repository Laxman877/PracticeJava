package assignment_string;
//W.A.J.P to divide a string in an equal part. 
public class A2_StringDiv {
	static void splitString(String str, int n) {
		int str_size = str.length();
		int part_size;
		if(str_size % n!=0) {
			System.out.println("The size of the given string is: "+n);
			return;
		}else {
			System.out.println("The given String is: "+str);
			System.out.println("The string divided into "+n+" parts and they are: ");
			part_size= str_size/n;
			for(int i=0;i<str_size;i++) {
				if(i % part_size==0)
					System.out.println();
				System.out.print(str.charAt(i));
			}
		}
	}
	public static void main(String[] args) {
		String str = "abcdefghijklmnopqrstuvwxy";
		int split_number = 5;
		splitString(str, split_number);
	}
}