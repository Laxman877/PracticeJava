package pattern;

public class Pattern10 {
	public static void main(String[] args) {
		int lines =5;
		int starcount = 1;
		int spacecount=lines -1;
		for(int j=1;j<=lines;j++) {
			for(int i=1;i<=spacecount;i++) {
				System.out.print(" ");
			}
			for(int k=1;k<=starcount; k++) {
				System.out.print("*");
			}
			System.out.println();
			starcount+=2;
			spacecount--;
		}
	}
}
