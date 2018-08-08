import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Assignment2{

	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int bakeryCount=0, dairyCount=0;
		String line = "";
		try{
			line = br.readLine();
		}
		catch(Exception ex){}
		String[] strs = line.trim().split("\\s+");
		bakeryCount = Integer.parseInt(strs[0]);
		dairyCount = Integer.parseInt(strs[1]);
		Store store = new Store(bakeryCount,dairyCount);
		Supplier[] Bakeries = new Supplier[bakeryCount];
		Supplier[] Dairies = new Supplier[dairyCount];
		for(int i=0; i < bakeryCount; i++){
			Bakeries[i] = new Supplier(i+1,"Bakery");
		}
		for(int i=0; i < dairyCount; i++){
			Dairies[i] = new Supplier(i+1,"Dairy");
		}
		int iterBakeries = 0, iterDairies = 0, orderCount = 0;
		while(true){
			try{
				line = br.readLine();
			}
			catch(Exception ex){}
			strs = line.trim().split("\\s+");
			if(strs[0].equals("END") || strs[0].equals("End")){
				break;			
			}
			switch(strs[0]){
				case "Bread":
				case "Cakes":
				case "Muffins":
					Order bakeryOrder = new Order(orderCount+1, strs[0], Integer.parseInt(strs[1]));
					Bakeries[iterBakeries].placeOrder(bakeryOrder);
					store.placeOrder(bakeryOrder);
					iterBakeries = (iterBakeries+1)%bakeryCount;
					orderCount++;
					break;
				case "Milk":
				case "Butter":
					Order dairyOrder = new Order(orderCount+1, strs[0], Integer.parseInt(strs[1]));
					Dairies[iterDairies].placeOrder(dairyOrder);
					store.placeOrder(dairyOrder);
					iterDairies = (iterDairies+1)%dairyCount;
					orderCount++;
					break;
			}
		}
		for(int i=0; i < bakeryCount; i++){
			System.out.println("Bakery" + (i+1));
			ArrayList<Order> _lstBakeryOrders = Bakeries[i].getOrderList();
			if(_lstBakeryOrders.size() > 0){
				Collections.reverse(_lstBakeryOrders);
				for(Order _bakeryOrder : _lstBakeryOrders){
					System.out.println(_bakeryOrder.getOrderSummary());
				}			
			}
			
		}
		for(int i=0; i < dairyCount; i++){
			System.out.println("Dairy" + (i+1));
			ArrayList<Order> _lstDairyOrders = Dairies[i].getOrderList();
			if(_lstDairyOrders.size() > 0){
				Collections.reverse(_lstDairyOrders);
				for(Order _dairyOrder : _lstDairyOrders){
					System.out.println(_dairyOrder.getOrderSummary());
				}			
			}
		}
		
	}

}
