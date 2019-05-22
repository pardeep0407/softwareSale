package softwareSale;

import static org.junit.Assert.*;

import org.junit.Test;

public class softwareSaleTest {

	@Test
	public void testBuyOneSoftwarePackage() {
		softwareSale s = new softwareSale();
		double finalprice = s.calculatePrice(1);
		assertEquals(99,finalprice,0);
	}

}
