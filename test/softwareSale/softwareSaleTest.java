package softwareSale;

import static org.junit.Assert.*;

import org.junit.Test;

public class softwareSaleTest {

	@Test
	public void testBuyOneSoftwarePackage() {
		softwareSale s = new softwareSale();
		double finalprice = s.calculatePrice(2);
		assertEquals(198,finalprice,0);
	}
	@Test
	public void testBuy10Package()
	{
		
	softwareSale s = new softwareSale();
	double finalPrice = s.calculatePrice(12);
			assertEquals(950.4,finalPrice,0);

}
}