package Example;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.experimental.categories.*;
@RunWith(Categories.class)
//@Categories.IncludeCategory(RegressionTest.class)
@Categories.IncludeCategory(PerformanceTest.class)
@Suite.SuiteClasses({JunitTest1.class,JunitTest2.class})
	

public class JunitTestSuit {
	
}
