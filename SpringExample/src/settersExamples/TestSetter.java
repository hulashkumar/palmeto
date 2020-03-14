package settersExamples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import springexamples.QuestionBank;

public class TestSetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("setterBeans.xml");
		Person q1=(Person) context.getBean("setPerson");
		q1.showDetails();
		
	}

}
