import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {
	private String name;
	private String address;
	private List<Product> orderedProducts;
	
	public Double shopBalance(Shop shop) {
		Double balance = 0.0;
		for (int i=0;i<shop.getOrderedProducts().size();i++) {
			balance +=shop.getOrderedProducts().get(i).getPrice()*shop.getOrderedProducts().get(i).getRemainder();
		}
		return new BigDecimal(balance).setScale(2, RoundingMode.HALF_UP).doubleValue();
		
	}
	
	public static List<Shop> sortByName(List<Shop>shopList){
		List<Shop> sortedShopList= shopList
				.stream()
				.sorted(Comparator.comparing(Shop::getName))
				.collect(Collectors.toList());
		return sortedShopList;
		
		
				
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Product> getOrderedProducts() {
		return orderedProducts;
	}
	public void setOrderedProducts(List<Product> orderedProducts) {
		this.orderedProducts = orderedProducts;
	}
	public Shop(String name, String address, List<Product> orderedProducts) {
		super();
		this.name = name;
		this.address = address;
		this.orderedProducts = orderedProducts;
	}
	public Shop() {
		
	}

}
