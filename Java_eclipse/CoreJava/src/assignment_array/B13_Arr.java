package assignment_array;
//W.A.J.P to calculate the average value of array elements. 
public class B13_Arr {
	public static void main(String[] args) {
		int num[]=new int[]{10,20,40,60,70,-60};
		int sum =0;
		for(int i=0;i<num.length;i++) {
			sum+=num[i];
	}
			double avg=sum/num.length;
			System.out.println("the average value of an array element: "+avg);
		
	}

}
