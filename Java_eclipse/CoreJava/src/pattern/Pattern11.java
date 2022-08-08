package pattern;

public class Pattern11 {
	public static void main(String[] args) {
		int lines = 7;
		int starcount = 1;
		int spacecount = lines -1;
		int mid = (lines / 2)+1;
		for(int i=1;i<=lines;i++) {
			for(int j=1;j<=spacecount;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=starcount;k++) {
				System.out.print("*");
			}
			System.out.println();
			if(i<mid) {
				starcount +=2;
				spacecount--;
			}
			else {
				starcount -=2;
				spacecount++;
			}
		}
	}
}
