package basicpracticle;
//prime number in between 1 to 100
public class Prime_num {
	public static void main(String[] args) {
		int count=0;
		System.out.println("prime number between 1 to 100 \n");
		for(int i =2;i<=100;i++) {
			for(int j=1;j<=i;j++) {
				if(i%j==0) 
					count++;
			}
				if(count==2) 
					System.out.print(" "+i);
					count=0;
		}
	}

}
