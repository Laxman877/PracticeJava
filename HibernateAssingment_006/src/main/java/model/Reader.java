package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "reader")
public class Reader {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int readerid;
	String email;
	String firstName;
	String lastName;
	@ManyToMany
	@JoinTable(
			name ="subscripation_reader",
			joinColumns = @JoinColumn(name="readerid"),
			inverseJoinColumns = @JoinColumn(name="subscriptionid")
			)
	List<Subscription> subscriptions;
	
	
	public Reader() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reader(int readerid, String email, String firstName, String lastName, List<Subscription> subscriptions) {
		super();
		this.readerid = readerid;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.subscriptions = subscriptions;
	}
	public int getReaderid() {
		return readerid;
	}
	public void setReaderid(int readerid) {
		this.readerid = readerid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public List<Subscription> getSubscriptions() {
		return subscriptions;
	}
	public void setSubscriptions(List<Subscription> sub) {
		// TODO Auto-generated method stub
		this.subscriptions = sub;
	}
	/*
	 * public void addsubscription(Subscription temSubscription) {
	 * if(subscriptions==null) { subscriptions=new ArrayList<Subscription>(); }
	 * subscriptions.add(temSubscription); }
	 */
	
}
