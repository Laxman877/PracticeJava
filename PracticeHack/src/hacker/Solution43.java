package hacker;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution43 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		Deque<Integer> deque=new ArrayDeque<>();
		int n=sc.nextInt();
		int m=sc.nextInt();
		Set<Integer> set=new HashSet<>();
		int max_count=0;
		for(int i=0;i<n;i++) {
			int num=sc.nextInt();
			deque.add(num);
			set.add(num);
			
			if(deque.size()==m) {
				if(set.size()>max_count) {
					max_count =set.size();
				}
				int item=deque.remove();
				if(!deque.contains(item))
					set.remove(item);
			}
		}
		System.out.println(max_count);
	}
}
