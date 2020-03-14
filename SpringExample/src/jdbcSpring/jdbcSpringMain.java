package jdbcSpring;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class jdbcSpringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("jdbcBean.xml");
		//DriverManagerDataSource obj=(DriverManagerDataSource) ctx.getBean("ds");
		
		EmployeeDao dao=(EmployeeDao)ctx.getBean("edao"); 
		 Employee2 emp=new Employee2();
		 Scanner sc=new Scanner(System.in);
		 //String Empid1=sc.next();
		 //String Ename1=sc.next();
		 //String Dept1=sc.next();
		 //String Desg1=sc.next();
		 //String email1=sc.next();
		 System.out.println("Enter Empid to update");
		 String Empid=sc.next();
		 emp.setEmpid(Empid);
		 System.out.println("Enter name");
		 emp.setEname(sc.next());
		 //emp.setEmpid(Ename1);
		 System.out.println("Enter Dept");
		 emp.setDept(sc.next());
		 System.out.println("Enter Desg");
		 emp.setDesg(sc.next());
		 System.out.println("Enter Email");
		 emp.setEmail(sc.next());
		 //emp.setEmpid("103");
		
		/*emp.setEname("Hulash kumar");
		 emp.setEmpid("1010");
		 emp.setDept("Testing");
		 emp.setDesg("tester");
		 emp.setEmail("sh@gmail.com");
		 int status=dao.saveEmployee(emp);
		 System.out.println(status); 
		 System.out.println("Records inserted");*/
		 
		 
		/*emp.setEname("Praveen kumar");
		emp.setDept("Devloper");
		emp.setEmpid("1010");*/
		int status1=dao.updateEmployee(emp);
	    System.out.println(status1); 
	    System.out.println("Records updated");
		 
		 
		/* emp.setEmpid("1010");
		 int status2=dao.deleteEmployee(emp);
		 System.out.println(status2); 
		 System.out.println("Records deleted");*/
		    
		    
		
	}

}