package Assignment;
import java.util.Scanner;
public class Sum_Average {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num =0;
		int sum=0;
		double avg;
		System.out.println("Input the number: ");
		for(int i=0;i<5;i++) {
			num = sc.nextInt();
			sum+=num;
		}
		avg=sum/5;
		System.out.println("sum of 5 no is: "+sum+"\n average of 5 no is: "+avg);
	}
}
