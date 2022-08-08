package pattern;

public class Pattern12 {
	public static void main(String[] args) {
		int lines = 5;
		int starcount = 1;
		for(int i=1;i<=lines;i++) {
			for(int j=1;j<=starcount;j++) {
				if((j%2)==(i%2)) {
					System.out.print("1");
				} else {
					System.out.print("0");
				}
			}
			System.out.println();
			starcount++;
		}
	}
}
