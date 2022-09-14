package hacker;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
class Checker implements Comparator<Player>{

	public int compare(Player o1, Player o2) {
		// TODO Auto-generated method stub
		if(o1.score == o2.score) {
			return o1.name.compareTo(o2.name);
		}else if(o1.score > o2.score)
			return -1;
		
		else return 1;
	}
	
}
class Player{
	String name;
	int score;
	public Player(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
}
public class Solution41 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter details");
		int n=sc.nextInt();
		
		Player[] player=new Player[n];
		Checker checker=new Checker();
		
		for(int i=0;i<n;i++) {
			player[i]=new Player(sc.next(), sc.nextInt());
		}
		sc.close();
		
		Arrays.sort(player, checker);
		for(int i=0;i<player.length;i++) {
			System.out.printf("%s %s\n",player[i].name, player[i].score);
		}
	}
}
