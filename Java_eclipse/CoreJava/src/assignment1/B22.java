package assignment1;
//display pattern like right angle triangle with number increased by 1
public class B22 {
	public static void main(String[] args) {

		int row =4;
		int k=1;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
	}

}
