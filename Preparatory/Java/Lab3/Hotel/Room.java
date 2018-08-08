import java.util.*;

public class Room{
	
	private int roomNo;
	private int noOfBeds;
	private float price;
	private Amenities amenities;

	public Room(){}

	public Room(int roomNo,int noOfBeds,float price, Amenities amenities){
		this.roomNo = roomNo;
		this.noOfBeds = noOfBeds;
		this.price = price;
		this.amenities = amenities;
	}

	public int getRoomNo(){
		return this.roomNo;
	}

	public void setRoomNo(int roomNo){
		this.roomNo = roomNo;
	}

	public int getBedCount(){
		return this.noOfBeds;
	}
	
	public void setBedCount(int noOfBeds){
		this.noOfBeds = noOfBeds;
	}
	
	public float getRoomPrice(){
		return this.price;
	}
	
	public void setRoomPrice(float price){
		this.price = price;
	}
	
	public Amenities getAmenities(){
		return this.amenities;
	}

}