import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class OrderTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}
	@Test
	void filterByOrdertest() {
		Order order1 = new Order ("Nr1",null,OrderType.PURCHASE);
		Order order2 = new Order ("Nr1",null,OrderType.PURCHASE);
		Order order3 = new Order ("Nr1",null,OrderType.SALE);
		Order order4 = new Order ("Nr1",null,OrderType.PURCHASE);
		Order order5 = new Order ("Nr1",null,OrderType.SALE);
		List <Order> orderList = new ArrayList<>(Arrays.asList(order1,order2,order3,order4,order5));
		assertEquals(3,Order.filterByOrder(OrderType.PURCHASE, orderList).size());

	}
	
	@Test
	public void makeOrderTest() throws FileNotFoundException, InsufficientProductException {
		 List<Product> products = Product.importProducts("products1.txt");
		 Shop maxima = new Shop ("Maxima","kazkur 50",products);
		 HashMap<String,Integer> order = new HashMap<>();
		 order.put("07886659844", 5);
		 order.put("06669844723", 7);
		 
		 Order.makeOrder(maxima, OrderType.PURCHASE, order);
		 assertEquals(11,products.get(0).getRemainder());
		 assertEquals(9,products.get(1).getRemainder());
		 
		 
		 
		 System.out.println(products.get(0).getName());
		 
	}
	@Test
	public void makeOrderTestSale() throws FileNotFoundException, InsufficientProductException {
		 List<Product> products = Product.importProducts("products1.txt");
		 Shop maxima = new Shop ("Maxima","kazkur 50",products);
		 HashMap<String,Integer> order = new HashMap<>();
		 order.put("07886659844", 2);
		 order.put("06669844723", 2);
		 
		 Order.makeOrder(maxima, OrderType.SALE, order);
		 assertEquals(4,products.get(0).getRemainder());
		 assertEquals(0,products.get(1).getRemainder());
		 
		 
		 
		 System.out.println(products.get(0).getName());
		 
	}
	@Test
	public void makeOrderTestSaleInsufficientProductsException() throws FileNotFoundException, InsufficientProductException {
		 List<Product> products = Product.importProducts("products1.txt");
		 Shop maxima = new Shop ("Maxima","kazkur 50",products);
		 HashMap<String,Integer> order = new HashMap<>();
		
		 order.put("06669844723", 5);
		 
		 
		 InsufficientProductException thrown = assertThrows (InsufficientProductException.class, ()->{
			Order.makeOrder(maxima, OrderType.SALE, order);
		 });
		 
		 assertEquals(2,thrown.getRemainder());
		 
		 
		 
		 
	}

}
