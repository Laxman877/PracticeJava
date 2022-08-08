package basic;
//print pyramid
public class Pattern03 {
	public static void main(String[] args) {
		int lines=7;
		int starcount=1;
		int spacecount=lines-1;
		for(int i=1;i<=lines;i++) {
			for(int k=1;k<=spacecount;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=starcount;j++) {
				System.out.print("*");
			}
			System.out.println();
			starcount+=2;
			spacecount--;
			
		}
	}
}
