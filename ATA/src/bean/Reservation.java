package bean;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.websocket.Session;

import org.apache.catalina.connector.Request;

public class Reservation {
	String ReservationId,UserId,VehicleId,RouteId,DriverId,BookingStatus,BoardingPoint,DropPoint,Vname;
	Date BookingDate,JourneyDate;
	Time Jtime;
	public Time getJtime() {
		return Jtime;
	}
	public void setJtime(String jtime) {
		
	}
	int TotalFare;
	public String getReservationId() {
		return ReservationId;
	}
	public void setReservationId() {
		ReservationId = "R"+new Date().getTime();
	}
	public void setReservationId(String reservationId) {
		ReservationId=reservationId;
	}
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String uid) {
		UserId = uid;
	}
	public String getVehicleId() {
		return VehicleId;
	}
	public void setVehicleId(String vehicleId) {
		VehicleId = vehicleId;
	}
	public String getRouteId() {
		return RouteId;
	}
	public void setRouteId(String routeId) {
		RouteId = routeId;
	}
	public String getDriverId() {
		return DriverId;
	}
	public void setDriverId(String driverId) {
		DriverId = driverId;
	}
	public String getBookingStatus() {
		return BookingStatus;
	}
	public void setBookingStatus(String bookingStatus) {
		BookingStatus = bookingStatus;
	}
	public void setBookingStatus() {
		BookingStatus = "pending";
	}
	public String getBoardingPoint() {
		return BoardingPoint;
	}
	public void setBoardingPoint(String boardingPoint) {
		BoardingPoint = boardingPoint;
	}
	public String getDropPoint() {
		return DropPoint;
	}
	public void setDropPoint(String dropPoint) {
		DropPoint = dropPoint;
	}
	public String getVname() {
		return Vname;
	}
	public void setVname(String vname) {
		Vname = vname;
	}
	public Date getBookingDate() {
		return new java.sql.Date(BookingDate.getTime());
	}
	public void setBookingDate() {
		BookingDate = new Date();
	}
	public Date getJourneyDate() {
		return new java.sql.Date(JourneyDate.getTime());
	}
	public void setJourneyDate(java.util.Date journeyDate) {
		
		JourneyDate = journeyDate;
	}
	public int getTotalFare() {
		return TotalFare;
	}
	public void setTotalFare(int totalFare) {
		TotalFare = totalFare;
	}
	
	

}
