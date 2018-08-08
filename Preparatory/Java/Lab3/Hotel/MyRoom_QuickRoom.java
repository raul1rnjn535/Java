import java.util.*;

public class MyRoom_QuickRoom{
	
	private int noOfBeds;
	private float price;
	
	public MyRoom_QuickRoom(){}

	public MyRoom_QuickRoom(int noOfBeds,float price){
		this.noOfBeds = noOfBeds;
		this.price = price;
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
	
}