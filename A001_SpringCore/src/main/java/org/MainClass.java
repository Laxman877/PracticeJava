package org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext contex=new ClassPathXmlApplicationContext("ApplicationContex2.xml");
		Question que=contex.getBean("que",Question.class);
		que.display();
	}
}
