package basic;

public class Practice07 {
	public static void main(String[] args) {
		int num=154;
		int sum=0;
		int temp=num;
		while(num!=0) {
			int rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
		}
		if(temp==sum) {
			System.out.println("armstrong");
		}else {
			System.out.println("Not Armtrong");
		}
	}
}
