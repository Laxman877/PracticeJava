package model;

import javax.persistence.*;

@Entity
@Table(name = "items")
public class Items {
	@Id
	@Column(name = "id")
	int id;
	@Column(name = "itemname")
	String itemname;
	@Column(name = "itemtotal")
	double itemtotal;
	@Column(name = "quantity")
	int quantity;
	@ManyToOne(cascade = {CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH,CascadeType.DETACH})
	@JoinColumn(name = "cartid")
	Cart cart;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemid() {
		return itemid;
	}
	public void setItemid(String itemid) {
		this.itemid = itemid;
	}
	public double getItemtotal() {
		return itemtotal;
	}
	public void setItemtotal(double itemtotal) {
		this.itemtotal = itemtotal;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
