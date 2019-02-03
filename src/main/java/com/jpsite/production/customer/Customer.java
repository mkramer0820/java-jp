package com.jpsite.production.customer;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity // annotation to say it will be in a jpa datastore
@Table(name = "customer_customer")
class Customer {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	private boolean isActive;
	
	private String name;
	
	private String address1;
	
	private String address2;
	
	private String address3;
	
	private String city;
	
	private String state;
	
	private String zipcode;
	
	private String country;
	
	private String email;
	
	private String phone;
	
	private String extension;
	
	private String website;
	
	private String description;
	
	private String createdOn;


	/*Customer(
			boolean isActive, String name, String address1,
			String address2, String address3, String city,
			String state, String zipcode, String country,
			String email, String phone, String extension,
			String website, String description, String createdOn) {
		this.isActive = isActive;
		this.name = name;
		this.address1 = address1;
		this.address2 = address2;
		this.address3 = address3;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.country = country;
		this.email = email;
		this.phone = phone;
		this.extension = extension;
		this.website = website;
		this.description = description;
		this.createdOn = createdOn;
	}*/


	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}


	public void setName(String name2) {
		// TODO Auto-generated method stub
		this.name = name2;
				
	}


	public boolean isActive() {
		return isActive;
	}


	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}


	public String getAddress1() {
		return address1;
	}


	public void setAddress1(String address1) {
		this.address1 = address1;
	}


	public String getAddress2() {
		return address2;
	}


	public void setAddress2(String address2) {
		this.address2 = address2;
	}


	public String getAddress3() {
		return address3;
	}


	public void setAddress3(String address3) {
		this.address3 = address3;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getZipcode() {
		return zipcode;
	}


	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getExtension() {
		return extension;
	}


	public void setExtension(String extension) {
		this.extension = extension;
	}


	public String getWebsite() {
		return website;
	}


	public void setWebsite(String website) {
		this.website = website;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getCreatedOn() {
		return createdOn;
	}


	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}


	public void setId(Long id2) {
		// TODO Auto-generated method stub
		this.id = id2;
	}



}
