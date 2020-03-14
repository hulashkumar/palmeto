package springexamples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import settersExamples.Person;

public class TestAutoWire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("autowire.xml");
		Employee1 q1=(Employee1) context.getBean("employee");
		System.out.println(q1.getFullname());
		System.out.println(q1.getDepartmentname().getName());
	}

}
