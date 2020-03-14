package eventHandling;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestOfEvent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("beanEvent.xml");
			ctx.start();

			HelloWorld obj=(HelloWorld) ctx.getBean("helloworld");
			obj.getMessage();
			ctx.refresh();
			ctx.stop();
	}

}
