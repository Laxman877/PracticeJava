package assignment_array;
//W.A.J.P to find the maximum and minimum value of an array. 
public class B16_Arr {
	public static void main(String[] args) {

		int a[]= {10,90,80,115,40,5,70,3,60};
		int max = a[0];
		int min = a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				min = max;
				max = a[i];
			}
			else if(a[i]<min) {
				min = a[i];
			}
		}
		System.out.println(" max value is: "+max);
		System.out.println(" min value is: "+min);
	
	}

}
