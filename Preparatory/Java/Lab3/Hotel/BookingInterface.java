import java.util.*;

public interface BookingInterface<T>{
	//ArrayList<T> lstItems=new ArrayList<T>();
	void set(ArrayList<T> lstItems);
	ArrayList<T> get();
	//T get();
	//void MySort(ArrayList<T> lstItems);
}