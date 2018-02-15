package bean;

public class Vehicle {
	String VehicleId,Name,Type,RegistrationNumber,IMG;
	int SeatingCapacity,FarePerKM;
	
	public void setVehicleId(String vehicleId) {
		VehicleId = vehicleId;
	}
	public String getVehicleId() {
		return VehicleId;
	}
	public Vehicle() {
		int randomNum;
		VehicleId = new String("V"+Integer.toString(randomNum = 0 + (int)(Math.random()*99999)));
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getRegistrationNumber() {
		return RegistrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		RegistrationNumber = registrationNumber;
	}
	public String getIMG() {
		return IMG;
	}
	public void setIMG(String iMG) {
		IMG = iMG;
	}
	public int getSeatingCapacity() {
		return SeatingCapacity;
	}
	public void setSeatingCapacity(String string) {
		SeatingCapacity = Integer.parseInt(string);
	}
	public int getFarePerKM() {
		return FarePerKM;
	}
	public void setFarePerKM(String string) {
		FarePerKM = Integer.parseInt(string);
	}
	

}
