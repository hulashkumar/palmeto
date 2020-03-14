package settersExamples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSetterList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("BeanSettersList.xml");
		TestQB q1=(TestQB) context.getBean("qb");
		q1.showdisplay();
	}

}
