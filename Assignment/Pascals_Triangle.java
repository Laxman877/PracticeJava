package Assignment;
//program for pascals triangle
public class Pascals_Triangle {
	public static void main(String[] args) {
		int row = 5;
		for(int i=0;i<row;i++) {
			int num=1;
			for(int j=0;j<=i;j++) {
				if(i==0 || j==0) 
					num=1;
					
				else 
					num = num*(i-j+1)/j;
					System.out.print(num+" ");
				
			}
			System.out.println();
		}
	}

}
