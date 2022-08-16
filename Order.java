import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Order {
private String orderNr;
private HashMap<String,Integer> products;
private OrderType orderType;

public static List<Order> filterByOrder(OrderType orderType,List<Order> orderList){
	List<Order> list = orderList
			.stream()
			.filter(order -> order.getType().equals(orderType))
			.collect(Collectors.toList());
	return list;
	
}
public static void makeOrder (Shop shop, OrderType orderType, HashMap <String,Integer> products) throws InsufficientProductException {
	for (int i=0;i<shop.getOrderedProducts().size();i++) {
		if (products.containsKey(shop.getOrderedProducts().get(i).getBarcode())) {
			if(orderType.equals(OrderType.PURCHASE)) {
				Integer newRemainder=shop.getOrderedProducts().get(i).getRemainder() + products.get(shop.getOrderedProducts().get(i).getBarcode());
				shop.getOrderedProducts().get(i).setRemainder(newRemainder);
			}
			else {
				
				if(shop.getOrderedProducts().get(i).getRemainder()< products.get(shop.getOrderedProducts().get(i).getBarcode())) {
					throw new InsufficientProductException("Inssufficient product"+shop.getOrderedProducts().get(i).getName()+ "exception",shop.getOrderedProducts().get(i).getRemainder());
				}
				
				Integer newRemainder=shop.getOrderedProducts().get(i).getRemainder() - products.get(shop.getOrderedProducts().get(i).getBarcode());
				shop.getOrderedProducts().get(i).setRemainder(newRemainder);
				
			}
		}
	}
	
}


public String getOrderNr() {
	return orderNr;
}
public void setOrderNr(String orderNr) {
	this.orderNr = orderNr;
}
public HashMap<String, Integer> getProducts() {
	return products;
}
public void setProducts(HashMap<String, Integer> products) {
	this.products = products;
}
public OrderType getType() {
	return orderType;
}
public void setType(OrderType orderType) {
	this.orderType = orderType;
}
public Order(String orderNr, HashMap<String, Integer> products, OrderType orderType) {
	super();
	this.orderNr = orderNr;
	this.products = products;
	this.orderType = orderType;
}
public Order() {
	
}
}
