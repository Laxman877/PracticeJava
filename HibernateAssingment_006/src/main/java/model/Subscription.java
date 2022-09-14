package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "subscription")
public class Subscription {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int subscriptionid;
	String subscriptionName;
	@ManyToMany
	@JoinTable(
			name  ="subscripation_reader",
			joinColumns  = @JoinColumn(name="subscriptionid"),
			inverseJoinColumns  = @JoinColumn(name="readerid")
			)
	List<Reader> readers;
	
	public Subscription() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Subscription(int subscriptionid, String subscriptionName, List<Reader> readers) {
		super();
		this.subscriptionid = subscriptionid;
		this.subscriptionName = subscriptionName;
		this.readers = readers;
	}
	public int getSubscriptionid() {
		return subscriptionid;
	}
	public void setSubscriptionid(int subscriptionid) {
		this.subscriptionid = subscriptionid;
	}
	public String getSubscriptionName() {
		return subscriptionName;
	}
	public void setSubscriptionName(String subscriptionName) {
		this.subscriptionName = subscriptionName;
	}
	
	public List<Reader> getReaders() {
		return readers;
	}
	public void setReaders(List<Reader> readers) {
		this.readers = readers;
	}
	/*
	 * public void addreader(Reader temReader) { if(readers==null) { readers=new
	 * ArrayList<Reader>(); } readers.add(temReader); }
	 */
}
