package se.newton.project.DBModels;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ContactInformation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int contactInformationId;
	private int streetNumber;
	private String street;
	private String city;
	private int postalCode;
	
	public int getContactInformationId() {
		return contactInformationId;
	}
	public void setContactInformationId(int contactInformationId) {
		this.contactInformationId = contactInformationId;
	}
	public int getStreetNumber() {
		return streetNumber;
	}
	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	
	
}
