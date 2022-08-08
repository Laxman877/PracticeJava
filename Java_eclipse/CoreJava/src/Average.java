import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter three numbers: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int Avg= x + y + z / 3;
		System.out.println("Average of the numbers: "+Avg);
	}
}
