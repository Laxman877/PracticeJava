package hacker;

import java.util.Scanner;

public class Solution07 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter something");
		int i=1;
		while(sc.hasNext()) {
			String s=sc.nextLine();
			System.out.println(i+" "+s);
			i++;
		}
	}
}
