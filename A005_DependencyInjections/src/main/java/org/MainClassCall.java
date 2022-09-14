package org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClassCall {
	public static void main(String[] args) {
		ApplicationContext contex=new ClassPathXmlApplicationContext("applicationcontex1.xml");
		Address adr=contex.getBean("adr",Address.class);
		adr.display();
	}
}
