package array;
//program for array multiplication
public class Array_mul {
	public static void main(String[] args) {

		int a[][]= {{10,20,30},{40,50,60},{70,80,90}};
		int b[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int c[][]= new int [3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("**********");
		for(int i=0;i<3;i++) {

			for(int j=0;j<3;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("============");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=0;
				for(int k=0;k<3;k++) {
				c[i][j]+=a[i][k]*b[k][j];
				}
				System.out.print(c[i][j]+" ");
				
			}
			System.out.println();
		}
	}
}
