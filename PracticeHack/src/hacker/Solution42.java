package hacker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Student1{
	private int id;
	private String fname;
	private double cgpa;
	public Student1(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	
}
public class Solution42 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter studet details");
		int testcases=Integer.parseInt(sc.nextLine());
		
		List<Student1> students=new ArrayList<Student1>();
		while(testcases > 0) {
			int id=sc.nextInt();
			String fname=sc.next();
			double cgpa=sc.nextDouble();
			
			Student1 st = new Student1(id, fname, cgpa);
			students.add(st);
			testcases--;
		}
		Collections.sort(students, Comparator.comparing(Student1::getCgpa).reversed().thenComparing(Student1::getFname).thenComparing(Student1::getId));
		
		for(Student1 st:students) {
			System.out.println(st.getFname());
		}
	}
}
