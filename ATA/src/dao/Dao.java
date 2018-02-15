package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jdbc.Dbconfig;
import bean.Driver;
import bean.Reservation;
import bean.Route;
import bean.Userprofile;
import bean.Vehicle;

public class Dao {
	static Connection con;
	ResultSet res;
	int status=-1;
	
	static{
		con=Dbconfig.getCon();
	}
	
/*	public int getFare(String id){
		int fare;
		PreparedStatement ps=con.prepareStatement("select totalfare from route where routeid=?");
		ps.setString(1,id);
		ResultSet res=ps.executeQuery();
		if(res.next()){
		
			fare=res.getString(1);
			return fare;
		
	}*/
	
	public int isAdmin(String emailid, String password){
		
		try{
			
			PreparedStatement ps=con.prepareStatement("select usertype from userprofile where emailid=? and password=?");
			ps.setString(1,emailid);
			ps.setString(2,password);
			ResultSet res=ps.executeQuery();
			if(res.next()){
			
				if(res.getString(1).equals("c")){
					status=1;
				}
				else{
					status=0;
				}
			}
			
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return status;
	}	
	
 public String uid(String emailid, String password) throws SQLException{
		
		
			String id=new String();
			PreparedStatement ps=con.prepareStatement("select userid from userprofile where emailid=? and password=?");
			ps.setString(1,emailid);
			ps.setString(2,password);
			ResultSet res=ps.executeQuery();
			if(res.next()){
				id=res.getString(1);
			}	
			return id; 
		
	     
 }
 public boolean insertUserProfile(Userprofile s){
		
		try {
			PreparedStatement ps=con.prepareStatement("insert into userprofile values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1,s.getUserId());
			ps.setString(2, s.getFirstname());
			ps.setString(3,s.getLastname());

			ps.setString(4,s.getGender());
			ps.setString(5,s.getStreet());
			ps.setString(6,s.getLocation());
			ps.setString(7,s.getCity());
			ps.setString(8,s.getState());
			ps.setString(9,s.getPincode());
			ps.setString(10,s.getMobileNo());
			ps.setString(11,s.getEmailId());
			ps.setString(12,s.getPassword());
			ps.setString(13,s.getUsertype());
			ps.setInt(14,s.getLoginstatus());
			
			if(ps.executeUpdate()>0)
				return true;
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
  }
 
 public boolean updateUserProfile(Userprofile s){
		
		try{
			
			PreparedStatement ps=con.prepareStatement("update userprofile set firstname=?,lastname=?,gender=?,street=?,location=?,city=?,state=?,pincode=?,mobileno=?,emailid=?,password=?,usertype=?,loginstatus=? where userid=?");
			ps.setString(1, s.getFirstname());
			ps.setString(2,s.getLastname());
			
			ps.setString(3,s.getGender());
			ps.setString(4,s.getStreet());
			ps.setString(5,s.getLocation());
			ps.setString(6,s.getCity());
			ps.setString(7,s.getState());
			ps.setString(8,s.getPincode());
			ps.setString(9,s.getMobileNo());
			ps.setString(10,s.getEmailId());
			ps.setString(11,s.getPassword());
			ps.setString(12,s.getUsertype());
			ps.setInt(13,s.getLoginstatus());
			ps.setString(14,s.getUserId());
			
			if(ps.executeUpdate()>0)
				return true;
			
		}catch(Exception e){
			e.printStackTrace();
			}
		
		return false;
		
	}
 
 public boolean delUserProfile(String userid){
		
		try {
			PreparedStatement ps=con.prepareStatement("delete from userprofile where userid=?");
			ps.setString(1,userid);
			
			if(ps.executeUpdate()>0)
				return true;
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	
	}
 
 public ResultSet viewUserProfile(String id){
	 PreparedStatement ps;
	try {
		ps = con.prepareStatement("select * from userprofile where userid=?");
		ps.setString(1, id);
		res=ps.executeQuery();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 return res;
 }
 public boolean insertDriver(Driver s){
		
		try {
			PreparedStatement ps=con.prepareStatement("insert into driver values(?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1,s.getDriverId());
			ps.setString(2,s.getName());
			ps.setString(3,s.getStreet());
			ps.setString(4,s.getLocation());
			ps.setString(5,s.getCity());
			ps.setString(6,s.getState());
			ps.setString(7,s.getPincode());
			ps.setString(8,s.getMobileNo());
			ps.setString(9,s.getLicenseNo());
			ps.setString(10,s.getEmail());
			
			if(ps.executeUpdate()>0)
				return true;
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
  }
 
 public boolean updateDriver(Driver s){
		
		try{
			
			PreparedStatement ps=con.prepareStatement("update driver set name=?,street=?,location=?,city=?,state=?,pincode=?,mobileno=?,licenseno=?,email=? where driverid=?");
			ps.setString(1,s.getName());
			ps.setString(2,s.getStreet());
			ps.setString(3,s.getLocation());
			ps.setString(4,s.getCity());
			ps.setString(5,s.getState());
			ps.setString(6,s.getPincode());
			ps.setString(7,s.getMobileNo());
			ps.setString(8,s.getLicenseNo());
			ps.setString(9,s.getEmail());
			ps.setString(10,s.getDriverId());
			
			if(ps.executeUpdate()>0)
				return true;
			
		}catch(Exception e){
			e.printStackTrace();
			}
		
		return false;
		
	}
 
 
 public boolean delDriver(String DriverId){
		
		try {
			PreparedStatement ps=con.prepareStatement("delete from driver where driverid=?");
			ps.setString(1,DriverId);
			
			if(ps.executeUpdate()>0)
				return true;
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	
	}
 
 public ResultSet viewDriver(){
	 PreparedStatement ps;
	try {
		ps = con.prepareStatement("select * from driver");
		res=ps.executeQuery();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 return res;
 }
 
 public ResultSet viewDriver(String id){
	 PreparedStatement ps;
	try {
		ps = con.prepareStatement("select * from driver where driverid=?");
		ps.setString(1, id);
		res=ps.executeQuery();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 return res;
 }
 
 public boolean insertVehicle(Vehicle s){
		
		try {
			PreparedStatement ps=con.prepareStatement("insert into vehicle values(?,?,?,?,?,?,?)");
			ps.setString(1,s.getVehicleId());
			ps.setString(2,s.getName());
			ps.setString(3,s.getType());
			ps.setString(4,s.getRegistrationNumber());
			ps.setInt(5,s.getSeatingCapacity());
			ps.setInt(6,s.getFarePerKM());
			ps.setString(7,s.getIMG());
			if(ps.executeUpdate()>0)
				return true;
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
  }
 
 
 public boolean updateVehicle(Vehicle s){
		
		try{
			
			PreparedStatement ps=con.prepareStatement("update vehicle set name=?,type=?,registrationnumber=?,seatingcapacity=?,fareperkm=?,img=? where vehicleid=?");
			ps.setString(1,s.getName());
			ps.setString(2,s.getType());
			ps.setString(3,s.getRegistrationNumber());
			ps.setInt(4,s.getSeatingCapacity());
			ps.setInt(5,s.getFarePerKM());
			ps.setString(6,s.getIMG());
			ps.setString(7,s.getVehicleId());
			
			if(ps.executeUpdate()>0)
				return true;
			
		}catch(Exception e){
			e.printStackTrace();
			}
		
		return false;
		
	}
 
 public boolean delVehicle(String VehicleId){
		
		try {
			PreparedStatement ps=con.prepareStatement("delete from vehicle where vehicleid=?");
			ps.setString(1,VehicleId);
			
			if(ps.executeUpdate()>0)
				return true;
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

		
	}
 
 public ResultSet viewVehicle(){
	 PreparedStatement ps;
	try {
		ps = con.prepareStatement("select * from vehicle");
		res=ps.executeQuery();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 return res;
 }
 
 public ResultSet viewVehicle(String id){
	 PreparedStatement ps;
	try {
		ps = con.prepareStatement("select * from vehicle where vehicleid=?");
		ps.setString(1, id);
		res=ps.executeQuery();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 return res;
 }

 public boolean insertRoute(Route s){
		
		try {
			PreparedStatement ps=con.prepareStatement("insert into route values(?,?,?,?,?,?)");
			ps.setString(1,s.getRouteId());
			ps.setString(2,s.getSource());
			ps.setString(3,s.getDestination());
			ps.setInt(4,s.getDistance());
			ps.setInt(5,s.getTravelDuration());
			ps.setInt(6,s.getFare());
			if(ps.executeUpdate()>0)
				return true;
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
  }
 
 
 public boolean updateRoute(Route s){
		
		try{
			
			PreparedStatement ps=con.prepareStatement("update route set source=?,destination=?,distance=?,travelduration=? where routeid=?");
			ps.setString(1,s.getSource());
			ps.setString(2,s.getDestination());
			ps.setInt(3,s.getDistance());
			ps.setInt(4,s.getTravelDuration());
			ps.setString(5,s.getRouteId());
			
			if(ps.executeUpdate()>0)
				return true;
			
		}catch(Exception e){
			e.printStackTrace();
			}
		
		return false;
		
	}
 
 
 public boolean delRoute(String RouteId){
		
		try {
			PreparedStatement ps=con.prepareStatement("delete from route where routeid=?");
			ps.setString(1,RouteId);
			
			if(ps.executeUpdate()>0)
				return true;
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

		
	}
 
 public ResultSet viewRoute(){
	 PreparedStatement ps;
	try {
		ps = con.prepareStatement("select * from route");
		res=ps.executeQuery();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 return res;
 }
 
 public ResultSet viewRouteId(){
	 PreparedStatement ps;
	try {
		ps = con.prepareStatement("select routeid, source, destination from route");
		res=ps.executeQuery();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 return res;
 }
 
 
 public ResultSet viewRoute(String r_id){
	 PreparedStatement ps;
	try {
		ps = con.prepareStatement("select * from route where routeid=?");
		ps.setString(1,r_id);
		res=ps.executeQuery();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 return res;
 }
 
 public boolean insertReservation(Reservation s){
		
		try {
			PreparedStatement ps=con.prepareStatement("insert into reservation values(?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1,s.getReservationId());
			ps.setString(2,s.getUserId());
			ps.setString(3,s.getVehicleId());
			ps.setString(4,s.getRouteId());
			ps.setDate(5,(Date)s.getBookingDate());
			ps.setDate(6,(Date)s.getJourneyDate());
			ps.setString(7,s.getDriverId());
			ps.setString(8,s.getBookingStatus());
			ps.setInt(9,0);
			ps.setString(10,s.getBoardingPoint());
			ps.setString(11,s.getDropPoint());
			ps.setString(12,null);
			if(ps.executeUpdate()>0)
				return true;
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
  }
 
 
 public boolean updateReservation(Reservation s){
		
		try{
			
			PreparedStatement ps=con.prepareStatement("update reservation set userid=?,vehicleid=?,routeid=?,bookingdate=?,journeydate=?,driverid=?,bookingstatus=?,totalfare=?,boardingpoint=?,droppoint=?,vname=? where reservationid=?");
			ps.setString(1,s.getUserId());
			ps.setString(2,s.getVehicleId());
			ps.setString(3,s.getRouteId());
			ps.setDate(4,(Date)s.getBookingDate());
			ps.setDate(5,(Date)s.getJourneyDate());
			ps.setString(6,s.getDriverId());
			ps.setString(7,s.getBookingStatus());
			ps.setInt(8,s.getTotalFare());
			ps.setString(9,s.getBoardingPoint());
			ps.setString(10,s.getDropPoint());
			ps.setString(11,s.getVname());
			ps.setString(12,s.getReservationId());
			
			if(ps.executeUpdate()>0)
				return true;
			
		}catch(Exception e){
			e.printStackTrace();
			}
		
		return false;
		
	}
 
 
 public boolean cancelReservation(String ReservationId){
		
		try {
			PreparedStatement ps=con.prepareStatement("delete from reservation where reservationid=?");
			ps.setString(1,ReservationId);
			
			if(ps.executeUpdate()>0)
				return true;
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

		
	}

 public ResultSet viewReservation(){
	 PreparedStatement ps;
	try {
		ps = con.prepareStatement("select * from reservation where bookingstatus=?");
		ps.setString(1, "pending");
		res=ps.executeQuery();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 return res;
 }
 
}


