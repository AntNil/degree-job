package se.newton.project.DBModels;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int userId;
	private String userMail;
	private String password;
	@OneToOne(targetEntity = se.newton.project.DBModels.ContactInformation.class, cascade = CascadeType.ALL)
	private ContactInformation contactInformation;
	
	//orders which have not been sent yet
	@OneToMany(targetEntity = se.newton.project.DBModels.Cart.class, cascade = CascadeType.ALL)
	private List<Cart> orderList = new ArrayList();
	
	//order which have been sent
	@OneToMany(targetEntity = se.newton.project.DBModels.Cart.class, cascade = CascadeType.ALL)
	private List<Cart> sentOrderList = new ArrayList();

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserMail() {
		return userMail;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ContactInformation getContactInformation() {
		return contactInformation;
	}

	public void setContactInformation(ContactInformation contactInformation) {
		this.contactInformation = contactInformation;
	}

	public List<Cart> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<Cart> orderList) {
		this.orderList = orderList;
	}

	public List<Cart> getSentOrderList() {
		return sentOrderList;
	}

	public void setSentOrderList(List<Cart> sentOrderList) {
		this.sentOrderList = sentOrderList;
	}
}
