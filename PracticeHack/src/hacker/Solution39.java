package hacker;

import java.util.HashSet;
import java.util.Scanner;

public class Solution39 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter..");
		int t=sc.nextInt();
		String []pair_left=new String[t];
		String []pair_right=new String[t];
		
		for(int i=0;i<t;i++) {
			pair_left[i]=sc.next();
			pair_right[i]=sc.next();
		}
		try {
			HashSet pairs=new HashSet<>(t);
			for(int i=0;i<=t;i++) {
				pairs.add(pair_left[i]+" "+pair_right[i]);
				System.out.println(pairs.size());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
