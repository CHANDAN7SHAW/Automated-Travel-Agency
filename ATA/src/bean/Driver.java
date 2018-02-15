package bean;

import java.util.Date;

public class Driver {
	String DriverId,Name,Street,Location,City,State,Pincode,MobileNo,LicenseNo,Email;

	public String getEmail() {
		return Email;
	}

	public void setDriverId(String driverId) {
		DriverId = driverId;
	}

	public String getDriverId() {
		return DriverId;
	}

	public Driver() {
		DriverId="D"+new Date().getTime();
		//DriverId = new String("D"+Integer.toString(randomNum = 0 + (int)(Math.random()*99999)));
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
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

	public String getLicenseNo() {
		return LicenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		LicenseNo = licenseNo;
	}

	public void setEmail(String email) {
		Email=email;
		
	}

}
