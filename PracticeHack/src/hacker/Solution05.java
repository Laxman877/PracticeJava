package hacker;

import java.util.Scanner;

public class Solution05 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int n=sc.nextInt();
			
			int sum=a;
			for(int j=0;j<n;j++) {
				sum+=b *Math.pow(2, j);
				System.out.print(sum+" ");
			}
			System.out.println();
		}
	}
}
