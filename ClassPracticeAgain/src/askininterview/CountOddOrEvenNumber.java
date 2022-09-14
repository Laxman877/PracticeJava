package askininterview;

public class CountOddOrEvenNumber {
	public static void main(String[] args) {
		int num=123467;
		int even_count=0;
		int odd_count=0;
		
		while(num>0) {
			int rem=num%10;
			if(rem%2==0) {
				even_count++;
			}else {
				odd_count++;
			}
			num=num/10;
		}
		System.out.println("Number of even digit in Number: "+even_count);
		System.out.println("Number of odd digit in number: "+odd_count);
	}
}
