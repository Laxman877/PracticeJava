package practice;

public class Array_mulipliction {
	public static void main(String[] args) {
		int arr1[][] = {{10,20,30},{40,50,60},{70,80,90}};
		int arr2[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int arr3[][] = new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("*********");
		for(int  i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("==========");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				arr3[i][j]=0;
				for(int k=0;k<3;k++) {
					arr3[i][j]+=arr1[i][k]*arr2[k][j];
				}
				System.out.print(arr3[i][j]+" ");
			}
		
		System.out.println();
		}
	}
}
