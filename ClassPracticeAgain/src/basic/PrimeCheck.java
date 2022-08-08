package basic;
//prime number check
public class PrimeCheck {
	public static void main(String[] args) {
		for(int num=3;num<=20;num++) {
			int flag=0;
			for(int i=2;i<num;i++) {
				if(num%i==0) {
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println(num+" is prime number");
			}else {
				System.out.println(num+" is not prime number");
			}
		}
	}
}
