package bean;

import java.sql.Date;

public class Userprofile {
	String UserId,Firstname,Lastname,Gender,Street,Location,City,State,Pincode,MobileNo,EmailId,Password,Usertype;
	
	int Loginstatus;
	public Userprofile() {
		UserId = "U"+new Date(0).getTime();
		Usertype="u";
	}
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
		
	}
	
	
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getPincode() {
		return Pincode;
	}
	public void setPincode(String pincode) {
		Pincode = pincode;
	}
	public String getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getUsertype() {
		return Usertype;
	}
	public void setUsertype(String usertype) {
		Usertype = usertype;
	}
	
	public int getLoginstatus() {
		return Loginstatus;
	}
	public void setLoginstatus(int loginstatus) {
		Loginstatus = loginstatus;
	}
	
}
