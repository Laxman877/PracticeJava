package array;

public class practice1 {
	public static void main(String[] args) {
		int marks[]= new int [] {75,62,98,77,99,53,45,96,88,42};
		int sum=0;
		for(int i=0;i<marks.length;i++) {
			sum=sum+marks[i];
		}
		double avg = sum/marks.length;
		System.out.println("the average marks of the 10 student is: "+avg);
	}
}
