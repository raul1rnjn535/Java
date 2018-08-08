import java.util.ArrayList;

public class Store{
	
	private int bakeryCount;
	private int dairyCount;
	private ArrayList<Order> lstOrder;

	public Store(){
		this.lstOrder = new ArrayList<Order>();	
	}

	public Store(int bakeryCount, int dairyCount){
		this.bakeryCount = bakeryCount;
		this.dairyCount = dairyCount;
		this.lstOrder = new ArrayList<Order>();
	}
	
	public int getBakeryCount(){
		return this.bakeryCount;
	}
	
	public int getDairyCount(){
		return this.dairyCount;
	}
	
	public void placeOrder(Order order){
		lstOrder.add(order);
	}

	public Order getOrder(int orderId){
		return lstOrder.get(orderId);
	}

	public ArrayList<Order> getOrderList(){
		return lstOrder;
	}

	//public Boolean isOrderServiced(){}
}
