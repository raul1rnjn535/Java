/*public interface BookingInterfaceArrayList<T>{
	//ArrayList<T> lstItems=new ArrayList<T>();
	void set(ArrayList<T> lstItems);
	ArrayList<T> get();
	//T get();
	//void MySort(ArrayList<T> lstItems);
}

*/
import java.util.*;


public class QuickRooms implements BookingInterface<MyHotel_QuickRoom>{

	ArrayList<MyHotel_QuickRoom> lstItems=new ArrayList<MyHotel_QuickRoom>();

	public void set(ArrayList<MyHotel_QuickRoom> lstItems){
		this.lstItems.addAll(lstItems);
	}
	public ArrayList<MyHotel_QuickRoom> get(){
		return this.lstItems;
	}
	//T get();
	//void MySort(ArrayList<MyHotel_QuickRoom> lstItems);

}