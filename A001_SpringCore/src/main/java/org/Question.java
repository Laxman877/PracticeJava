package org;

import java.util.List;

public class Question {
	int qid;
	String que;
	List<Answer> ans;
	public Question(int qid, String que, List<Answer> ans) {
		super();
		this.qid = qid;
		this.que = que;
		this.ans = ans;
	}
	public void display() {
		System.out.println(qid+" "+que);
		for(Answer a:ans) {
			a.display();
		}
	}
}
