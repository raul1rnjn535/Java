public class Order{
	private int orderId;
	private String item;
	private int quantity;
	private Boolean isServiced;

	public Order(){}

	public Order(int orderId, String item, int quantity){
		this.orderId = orderId;
		this.item = item;
		this.quantity = quantity;
		this.isServiced = false;
	}

	public void updateOrder(int quantity){
		this.quantity = quantity;
	}

	public String getOrderSummary(){
		return (this.orderId + " " + this.item + " " + this.quantity);
	}
}
