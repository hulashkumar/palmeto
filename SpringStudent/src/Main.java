import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Dao.StudentDaoImpl;
import Data.Student1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContextStudent.xml");
		Scanner sc=new Scanner(System.in);
		StudentDaoImpl sdao=(StudentDaoImpl) context.getBean("edao");
		while(true)
		{
		System.out.println("Enter your Choice");
		System.out.println("1:Insertion");
		System.out.println("2:delete");
		System.out.println("3:update");
		int n=sc.nextInt();
		
		switch(n) {
		case 1:
		System.out.println("Enter student id");
		int id=sc.nextInt();
		System.out.println("Enter Student name");
		String name=sc.next();
		System.out.println("Enter Age");
		int age=sc.nextInt();
		Student1 s=new Student1();
		s.setId(id);
		s.setName(name);
		s.setAge(age);
		sdao.create(s);
		break;
		
		case 2:
		Student1 s1=new Student1();
		s1.setId(sc.nextInt());
		int status2=sdao.delete(s1);
		 System.out.println(status2); 
		 System.out.println("Records deleted");
		 break;
		
		case 3:
		Student1 s2=new Student1();
		System.out.println("Enter the id of student to update details");
		s2.setId(sc.nextInt());
		System.out.println("Enter name");
		s2.setName(sc.next());
		System.out.println("Enter the age");
		s2.setAge(sc.nextInt());
		int status3=sdao.update(s2);
		System.out.println("Records updated");
		default:
		System.out.println("Sorry,you have entered wrong choice");
		}
		}
		
		/*Student1 st=new Student1();
		st.setId(108);
		st.setName("Swaroop-gundala");
		st.setAge(22);
		boolean status2=sdao.saveStudentByPst(st);
		System.out.println(status2);
		System.out.println("inserted");	
		}*/
		
	}
}
