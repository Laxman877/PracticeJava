package hacker;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.stream.Collectors;
class Priorities{
	
	public List<Students> getStudents(List<String> events){
		PriorityQueue<Students> q= new PriorityQueue<>();
		
		for(String event : events) {
			if(event.contains("ENTER")) {
				String[] student = event.split(" ");
				Students s= new Students(student[1], Double.parseDouble(student[2]), Integer.parseInt(student[3]));
				
				q.add(s);
			}
			if(event.contains("SERVED")) {
				if(q.size() > 0) {
					q.poll();
				}
			}
		}
		return q.stream().sorted().collect(Collectors.toList());
	}
}

class Students implements Comparable<Students>{
	
	private String name;
	private double cgpa;
	private int id;
	
	public Students() {
		// TODO Auto-generated constructor stub
	}
	
	public Students(String name, double cgpa, int id) {
		super();
		this.name = name;
		this.cgpa = cgpa;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int compareTo(Students o) {
		// TODO Auto-generated method stub
		if(this.cgpa == o.cgpa) {
			if(this.name.equals(o.name)) {
				return this.id - o.id;
			}else {
				return this.name.compareTo(o.name);
			}
		}else {
			return this.cgpa < o.cgpa ? 1 : -1;
		}
	}
	
}
public class Solution45 {
	
	private final static Scanner sc= new Scanner(System.in);
	private final static Priorities priorities= new Priorities();
	
	public static void main(String[] args) {
		System.out.println("Enter Input");
		int totalEvents = Integer.parseInt(sc.nextLine());
		List<String> events= new ArrayList<>();
		
		while(totalEvents-- !=0) {
			String event = sc.nextLine();
			events.add(event);
		}
		List<Students> students=priorities.getStudents(events);
		
		if(students.isEmpty()) {
			System.out.println("EMPTY");
		}else {
			for(Students st:students) {
				System.out.println(st.getName());
			}
		}
	}
}
