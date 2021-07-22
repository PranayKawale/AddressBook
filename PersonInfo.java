package com.bridgelab;
import javax.swing.*;

public class PersonInfo {
	private String name ;
	private String address ;
	private String phoneNumber ;
	private String emailId ;
	
	//Setters
	public void setAddress(String address) {
		this.address = address;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	//Getters
	
	public String getAddress() {
		return address;
	}
	public String getName() {
		return name;
	}
	public String getEmailId() {
		return emailId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	//parameterized constructors
	public PersonInfo (String a,String b, String c, String n) {
		setAddress(a);
		setEmailId(b);
		setName(c);
		setPhoneNumber(n);
	}
	//method for display person record
	public void print () {
		JOptionPane.showMessageDialog(null,"name : " +name+ "address :"  +address+
				"phoneNumber :" +phoneNumber+ "emailId :"+ emailId);
		
	}
	
	

}
