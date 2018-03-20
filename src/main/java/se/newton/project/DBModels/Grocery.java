package se.newton.project.DBModels;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Grocery {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int groceryId;
	private String groceryName;
	//amount as integer
	private int amount;
	//what kind of measurement for amount
	private String amountMeasurement;
	private String price;
	private String groceryCategories;
	private int cartId;
	
	
	public int getGroceryId() {
		return groceryId;
	}
	public void setGroceryId(int groceryId) {
		this.groceryId = groceryId;
	}
	public String getGroceryName() {
		return groceryName;
	}
	public void setGroceryName(String groceryName) {
		this.groceryName = groceryName;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getAmountMeasurement() {
		return amountMeasurement;
	}
	public void setAmountMeasurement(String amountMeasurement) {
		this.amountMeasurement = amountMeasurement;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getGroceryCategory() {
		return groceryCategories;
	}
	public void setGroceryCategory(String groceryCategory) {
		this.groceryCategories = groceryCategory;
	}
	public String getGroceryCategories() {
		return groceryCategories;
	}
	public void setGroceryCategories(String groceryCategories) {
		this.groceryCategories = groceryCategories;
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
}
