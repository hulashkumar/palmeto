package springexamples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext factory=new ClassPathXmlApplicationContext("beanperson.xml");
		Person obj=(Person)factory.getBean("per");
		obj.showDetails();
		factory.registerShutdownHook();
	}

}
