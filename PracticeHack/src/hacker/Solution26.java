package hacker;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution26 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		String n=sc.nextLine();
		BigInteger bn=new BigInteger(n);
		if(bn.isProbablePrime(1)) {
			System.out.println("prime");
		}else {
			System.out.println("not prime");
		}
		sc.close();
	}
}
