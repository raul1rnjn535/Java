import java.util.ArrayList;

public class Supplier{

	private int supplierId;
	private String supplierType;	
	private ArrayList<Order> lstOrder;
	
	public Supplier(){}
	
	public Supplier(int id, String supplierType){
		this.supplierId = id;
		this.supplierType = supplierType;
		this.lstOrder = new ArrayList<Order>();
	}

	public void placeOrder(Order order){
		this.lstOrder.add(order);
	}

	public Order getOrder(int orderId){
		return lstOrder.get(orderId);
	}

	public ArrayList<Order> getOrderList(){
		return this.lstOrder;
	}
}
