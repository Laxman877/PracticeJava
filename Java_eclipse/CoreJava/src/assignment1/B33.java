package assignment1;
//Write a Java program to compute the sum of the first 100 prime numbers. 
public class B33 {
	public static void main(String[] args) {
		int sum=1;
		int c=0;
		int n=0;
		
		while(c<100) {
			n++;
			if(n%2!=0) {
				if(is_Prime(n)) {
					sum+=n;
				}
			}
			c++;
		}
		System.out.println("\nSum of the prime number till 100: "+sum);
	}
	public static boolean is_Prime(int n) {
		for(int i=3;i*i<=n;i+=2) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

}
