package hacker;

import java.util.BitSet;
import java.util.Scanner;


public class Solution44 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter input");
		int n=sc.nextInt();
		int m=sc.nextInt();

		BitSet[] bitSet= {new BitSet(n), new BitSet(n)};

		for(int i=0;i<m;i++){
			String operationName= sc.next();
			int x=sc.nextInt();	
			int y=sc.nextInt();

			switch(operationName) {
			case "AND":
				bitSet[x - 1].and(bitSet[y - 1]);
				break;
			case "OR":
				bitSet[x - 1].or(bitSet[y - 1]);
				break;
			case "XOR":
				bitSet[x - 1].xor(bitSet[y - 1]);
				break;
			case "FLIP":
				bitSet[x - 1].flip(y);
				break;
			case "SET":
				bitSet[x - 1].set(y);
				break;
			default:
				break;
			}
			System.out.println( bitSet[0].cardinality()+" "+bitSet[1].cardinality());
		}
	}
}
