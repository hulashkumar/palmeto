package inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import settersExamples.Person;

public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("inheritancebean.xml");
		Employee q1=(Employee) context.getBean("parent");
		System.out.println(q1);
	}

}
