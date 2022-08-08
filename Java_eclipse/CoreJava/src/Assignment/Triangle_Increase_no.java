package Assignment;
//pattern like right angle triangle with increase numbers
public class Triangle_Increase_no {
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
