package configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMainConf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ApplicationContext ctx=new AnnotationConfigApplicationContext(HelloWorldConf.class);
			HelloWorld helloworld=ctx.getBean(HelloWorld.class);
			helloworld.setMessage("Hello World!");
			helloworld.getMessage();
			helloworld.showData();
			Employee emp=ctx.getBean(Employee.class);
			emp.show();
	}

}