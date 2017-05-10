import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LightBulbTest {

	LightBulb lightBulb;
	@Before
	public void setUp() throws Exception {
		lightBulb=new LightBulb(40);
	}

	@Test
	public void testWattage() {
		//fail("Not yet implemented");
		assertEquals(40,lightBulb.getBulbWattage());
	}

}
