package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Student;

public class DataClass {
	public static void main(String[] args) {
//		Student std=new Student();
//		std.setId(10);
//		std.setName("laxman");
//		std.setDept("java");
//		System.out.println(std.getId()+" "+std.getName()+" "+std.getDept());
		ApplicationContext contex=new ClassPathXmlApplicationContext("ApplicationContex.xml");
		Student std=contex.getBean("std",Student.class);
		std.display();
	}
}
