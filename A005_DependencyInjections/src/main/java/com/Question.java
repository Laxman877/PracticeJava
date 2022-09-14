package com;

public class Question {
	int qid;
	String que;
	public Question(int qid, String que) {
		super();
		this.qid = qid;
		this.que = que;
	}
	public void display() {
		System.out.println(qid+" "+que);
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQue() {
		return que;
	}
	public void setQue(String que) {
		this.que = que;
	}
	
}
