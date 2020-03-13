package Example;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class JunitTest2 {
	@Category(RegressionTest.class)
	@Test
	public void test1() {
		System.out.println("This is test 1 of JunitTest2");
		
	}
	@Category(PerformanceTest.class)
	@Test
	public void test2() {
		System.out.println("This is test of 2 junitTest2");
	}
}
