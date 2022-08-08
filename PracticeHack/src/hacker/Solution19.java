package hacker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution19 {
	public static String GetSmallestAndLargest(String s,int k) {
		String smallest="";
		String largest="";
		for(int i=0;i<=s.length()-k;i++) {
			String sub=s.substring(i,i+k);
			if(sub.compareTo(smallest)<0 || smallest.isEmpty()) {
				smallest=sub;
			}
			if(sub.compareTo(largest)>0 || smallest.isEmpty()) {
				largest=sub;
			}
		}
		return smallest+"\n"+largest;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		String S=sc.next();
		int K=sc.nextInt();
		sc.close();
		System.out.println(GetSmallestAndLargest(S, K));
	}
}
