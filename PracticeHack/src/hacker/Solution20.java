package hacker;

import java.util.Scanner;

public class Solution20 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		String s=sc.next();
		System.out.println(s.equals(new StringBuilder(s).reverse().toString())?"yes":"no");
	}
}
