import java.util.*;


public class MyHotel_QuickRoom{
	private int hotelId;
	private String hotelName;
	private ArrayList<MyRoom_QuickRoom> rooms;
	private float rating;
	
	public MyHotel_QuickRoom(){}

	public MyHotel_QuickRoom(String hotelName){
		this.hotelName = hotelName;
		this.rooms = new ArrayList<MyRoom_QuickRoom>();
		this.rating = 5;
	}

	public String getHotelName(){
		return this.hotelName;
	}

	public ArrayList<MyRoom_QuickRoom> getAllRooms(){
		return this.rooms;
	}

	public float getRating(){
		return this.rating;
	}

}