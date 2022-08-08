package hacker;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution37 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		int n=sc.nextInt();
		sc.nextLine();
		Map<String , Integer> map=new HashMap<>();
		for(int i=0;i<n;i++) {
			String name=sc.nextLine();
			int phone=sc.nextInt();
			sc.nextLine();
			map.put(name, phone);
		}
		while(sc.hasNext()) {
			String s=sc.nextLine();
			if(map.containsKey(s)) {
				System.out.println(s+"="+map.get(s));
			}else {
				System.out.println("Not found");
			}
		}
	}
}
