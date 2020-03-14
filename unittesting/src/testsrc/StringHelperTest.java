package testsrc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import unittesting.StringHelper;

class StringHelperTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		StringHelper sh=new StringHelper();
		assertEquals("CD",sh.truncateAInFirst2Positions("AACD"));
	}

}
