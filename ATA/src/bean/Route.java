package bean;

import java.util.Date;

public class Route {
	String RouteId,Source,Destination;
	int Distance,TravelDuration,Fare;
	
	public int getFare() {
		return Fare;
	}

	public void setFare(String fare) {
		Fare=Integer.parseInt(fare);
	}

	public void setRouteId(String routeId) {
		RouteId = routeId;
	}

	public String getRouteId() {
		return RouteId;
	}

	public Route() {
	//	int randomNum;
	//	RouteId = new String("RO"+Integer.toString(randomNum = 0 + (int)(Math.random()*99999)));
		RouteId="R"+new Date().getTime();
	}
	public Route(String routeId){
		RouteId=routeId;
	}

	public String getSource() {
		return Source;
	}

	public void setSource(String source) {
		Source = source;
	}

	public String getDestination() {
		return Destination;
	}

	public void setDestination(String destination) {
		Destination = destination;
	}

	public int getDistance() {
		return Distance;
	}

	public void setDistance(String distance) {
		Distance = Integer.parseInt(distance);
	}

	public int getTravelDuration() {
		return TravelDuration;
	}

	public void setTravelDuration(String travelDuration) {
		TravelDuration = Integer.parseInt(travelDuration);
	}

}
