import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ShopTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}
 @Test
 void shopBalanceTest() throws FileNotFoundException {
	 List<Product> products = Product.importProducts("products1.txt");
	 Shop maxima = new Shop ("Maxima","kazkur 50",products);
	 assertEquals(226.55,maxima.shopBalance(maxima));
	 
 }
 @Test
 void sortByNameTest () throws FileNotFoundException {
	 List<Product> products = Product.importProducts("products1.txt");
	 Shop maxima = new Shop ("Maxima","kazkur 50",products);
	 Shop iki = new Shop ("iki","kazkur 50",products);
	 Shop rimi = new Shop ("aba","kazkur 50",products);
	 List<Shop> shops = new ArrayList<>(Arrays.asList(maxima,iki,rimi));
	 List<Shop> sortedShops = Shop.sortByName(shops);
	 assertEquals("aba", sortedShops.get(0).getName());
 }
}
