package hacker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
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
public class Solution27 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("entetr");
		int testcases=Integer.parseInt(sc.nextLine());
		List<Student> stdlist=new ArrayList<Student>();
		while(testcases>0) {
			int id=sc.nextInt();
			String fname=sc.next();
			double cgpa=sc.nextDouble();
			Student st=new Student(id, fname, cgpa);
			stdlist.add(st);
			testcases--;
		}
		Collections.sort(stdlist,Comparator.comparing(Student::getCgpa).reversed().thenComparing(Student :: getFname).reversed().thenComparing(Student :: getId));
		for(Student st:stdlist) {
			System.out.println(st.getFname());
		}
	}
}
