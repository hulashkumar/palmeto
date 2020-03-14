package springexamples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestQBMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ApplicationContext context=new ClassPathXmlApplicationContext("MapQBXml.xml");
			QuestionMap Qm=(QuestionMap) context.getBean("Q");
			Qm.displayAnswers();
			
	}

}
