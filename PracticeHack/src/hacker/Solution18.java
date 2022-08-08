package hacker;

import java.util.Scanner;

public class Solution18 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		String s=sc.next();
		int start=sc.nextInt();
		int end=sc.nextInt();
		System.out.println(s.substring(start,end));
	}
}
