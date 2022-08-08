package hacker;

import java.util.Scanner;

public class Solution35 {
	public static boolean canWin(int leap,int[] game) {
		return isSolvable(leap,game,0);
	}
	private static boolean isSolvable(int m,int[] arr,int i) {
		if(i<0 || arr[i]==1) return false;
		if((i==arr.length-1)||i+m>arr.length-1) return true;
		arr[i]=1;
		return isSolvable(m,arr,i+1)|| isSolvable(m, arr, i-1)|| isSolvable(m, arr, i+m);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter");
		int q=sc.nextInt();
		while(q-->0) {
			int n=sc.nextInt();
			int leap=sc.nextInt();
			int[] game=new int[n];
			for(int i=0;i<n;i++) {
				game[i]=sc.nextInt();
			}
			System.out.println((canWin(leap,game))? "YES" : "NO");
		}
		sc.close();
	}
}
