package hacker;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution28 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		BigInteger a=new BigInteger(sc.next());
		BigInteger b=new BigInteger(sc.next());
		
		BigInteger a1,b1;
		a1=a.add(b);
		b1=a.multiply(b);
		System.out.println(a1);
		System.out.println(b1);
	}
}
