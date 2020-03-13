package Example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestMessages {
	@Test
	public void test1() {
		HelloWorld hw=new HelloWorld();
		assertEquals("Message1",hw.Message());
	}
}
