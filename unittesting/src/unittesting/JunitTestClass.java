package unittesting;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class JunitTestClass {
	/*@BeforeAll
	public static void BeforeClassBegins() {
		System.out.println("This will Excute before All");
		}
	@AfterAll
	public static void AfterClassBegins() {
		System.out.println("This will Excute After All");
		}
	@Test
	public void test1() {
		System.out.println("This is my test1");
	}*/
	@BeforeEach
	public void preMethod() {
		System.out.println("This will excute before test ");
	}
	@RepeatedTest(3)
	public void display() {
		System.out.println("This is my test2");
	}
	@AfterEach
	public void postMethod() {
		System.out.println("This will excute after test");
	}
}
