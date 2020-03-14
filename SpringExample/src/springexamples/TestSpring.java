package springexamples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
	      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
	      //Employee obj1 = (Employee) context.getBean("emp");
	      //Person1 obj4=(Person1) context.getBean("per");
	      //Address obj5=(Address) context.getBean("addr");
	     // Student obj2=(Student) context.getBean("st");
	      //obj.getMessage();
	      obj.displays();
	      //obj1.display();
	      //obj2.setName("Hello");
	      //obj2.setHtno("101");
	      //obj4.show();
	      //System.out.println(obj5);
	      
	      
	      //context.registerShutdownHook();
	}

}
