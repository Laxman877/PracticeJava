package Assignment;
//pattern like right angle triangle with increase numbers
public class Triangle_Increase_no {
	public static void main(String[] args) {
		int currentrow=1;
		int counter=1;
		int row=4;
		for(int i=1;i<=row;i++) {
			if(i%2==0) {
				for(int j=1;j<=i;j++) {
					System.out.print(counter+" ");
					counter++;
				}
			}
			else {
				int rev = currentrow+counter-1;
				for(int j=0;j<i;j++) {
					System.out.print(rev--+" ");
					counter++;
				}
			}
			System.out.println();
			currentrow++;
		}
	}
}
