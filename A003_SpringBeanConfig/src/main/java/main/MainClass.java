package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.CollectionList;
import com.Student;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		CollectionList list=context.getBean("std",CollectionList.class);
		System.out.println("List : "+list.getList());
	}
}
