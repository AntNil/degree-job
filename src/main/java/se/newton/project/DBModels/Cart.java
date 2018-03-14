package se.newton.project.DBModels;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Cart {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int cartId;
	private int totalPrice;
	
	@ManyToMany(targetEntity = se.newton.project.DBModels.Grocery.class, cascade = CascadeType.ALL)
	private List<Grocery> groceryList = new ArrayList();

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public List<Grocery> getGroceryList() {
		return groceryList;
	}

	public void setGroceryList(List<Grocery> groceryList) {
		this.groceryList = groceryList;
	}
}
