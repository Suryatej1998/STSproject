 package com.example.customer;


public class Customer {
    
	private int customerid;
	private String customername;
	private int phonenumber;
	private String shiptoaddress;
	private int shiptozip;
	private String shiptocity;
	private String shiptostate;
	
	
	public int getCustomerid() {
		return customerid;
	}
	public void setId(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setName(String customername) {
		this.customername = customername;
	}
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getShiptoaddress() {
		return shiptoaddress;
	}
	public void setShiptoaddress(String shiptoaddress) {
		this.shiptoaddress = shiptoaddress;
	}
	
	public void setShiptozip(int shiptozip) {
		this.shiptozip = shiptozip;
	}
	public int getShiptozip() {
		return shiptozip;
	}
	public String getShiptocity() {
		return shiptocity;
	}
	public void setShiptocity(String shiptocity) {
		this.shiptocity = shiptocity;
	}
	public String getShiptostate() {
		return shiptostate;
	}
	public void setShiptostate(String shiptostate) {
		this.shiptostate = shiptostate;
	}
}
