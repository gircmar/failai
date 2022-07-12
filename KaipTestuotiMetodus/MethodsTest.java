import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class MethodsTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}
	@Test
	void smallestTest() {
		Methods methods= new Methods();
		ArrayList<Integer> arrayList=new ArrayList<>(Arrays.asList(9,8,5,6,2,4,8,9));
		Integer smallest = methods.smallest(arrayList);
		assertEquals(smallest,2);
	}
	@Test
	void avarageNumberTest() {
		Methods methods= new Methods();
		ArrayList<Integer> arrayList=new ArrayList<>(Arrays.asList(5,5,5));
		double avarage = methods.avarageNumber(arrayList);
		assertEquals(avarage,5);
		
	}
	@Test
	void middleCharTest() {
		Methods methods= new Methods();
		String middle= "vidurinis";
		String middlechar = methods.middleChar(middle);
		assertEquals(middlechar,"ur");
		
	}
	

}
