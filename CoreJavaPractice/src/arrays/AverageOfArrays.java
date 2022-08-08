package arrays;

public class AverageOfArrays {
	public static void main(String[] args) {
		int num[]=new int[] {10,20,30,40,50,60,70};
		int sum=0;
		for(int i=0;i<num.length;i++) {
			sum+=num[i];
			
		}
		double avg=sum/num.length;
		System.out.println("the avg of array: "+avg);
	}
}
