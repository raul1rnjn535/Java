import java.util.*;


public class Hotel{
	private int hotelId;
	private String hotelName;
	private ArrayList<Room> rooms;
	private float rating;
	private int noOfVisitors;

	public Hotel(){}

	public Hotel(String hotelName){
		this.hotelName = hotelName;
		this.rooms = new ArrayList<Room>();
		this.rating = 5;
		this.noOfVisitors = 0;
	}

	public String getHotelName(){
		return this.hotelName;
	}

	public void addRoom(Room room){
		this.rooms.add(room); 
	}

	public void deleteRoom(int roomId){
		//this.rooms.append(room);
	}

	public ArrayList<Room> getAllRooms(){
		return this.rooms;
	}

	private void incVisitorCount(){
		this.noOfVisitors = this.noOfVisitors+1;
	}
	
	public float getRating(){
		return this.rating;
	}

	public void setRating(float rating){
		incVisitorCount();
		this.rating = ((this.rating*(this.noOfVisitors-1))+rating)/noOfVisitors;
		return;
	}

}