package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Question;
import com.Student;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext contex=new ClassPathXmlApplicationContext("applicationcontex.xml");
		Question que=contex.getBean("q", Question.class);
		Student std=contex.getBean("std", Student.class);
		que.display();
		std.display();
	}
}
