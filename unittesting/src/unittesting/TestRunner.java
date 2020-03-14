package unittesting;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class TestRunner {
	public static void main(String[]args) {
		JUnitCore.runClasses(JunitTestSuit.class);
		
		
	}
}
