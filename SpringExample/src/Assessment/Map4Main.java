package Assessment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Map4Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ApplicationContext context=new ClassPathXmlApplicationContext("Map4.xml");
			Map4 Qm=(Map4) context.getBean("Q");
			Qm.displayAnswers();
			
	}

}
