package org;

public class Answer {
	int aid;
	String ans;
	public Answer(int aid, String ans) {
		super();
		this.aid = aid;
		this.ans = ans;
	}
	public void display() {
		System.out.println(aid+" "+ans);
	}
	
}
