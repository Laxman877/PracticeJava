package basic;
//print star triangle pattern 
public class Pattern02 {
	public static void main(String[] args) {
		int lines=5;
		int starcount =lines;
		for(int i=1;i<=lines;i++) {
			for(int j=1;j<=starcount;j++) {
				System.out.print("*");
			}
			System.out.println();
			starcount--;
		}
	}
}
