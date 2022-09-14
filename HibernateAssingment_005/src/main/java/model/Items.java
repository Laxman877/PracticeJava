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
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
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
