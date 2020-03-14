package Assessment;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Assessment.StudentDaoImpl;
import Assessment.Student1;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("AssessmentStudent.xml");
		//Scanner sc=new Scanner(System.in);
		
		StudentDaoImpl sdao=(StudentDaoImpl) context.getBean("edao");
		List<Student1> list = sdao.listStudent1();
        for (Student1 s : list) {
            System.out.print(s.getId()+" "+s.getName()+" "+s.getAge());
            System.out.println();
            
        }
		
         
	}
}
