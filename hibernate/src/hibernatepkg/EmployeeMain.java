package hibernatepkg;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
//import org.osgi.service.blueprint.reflect.Metadata;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      
    SessionFactory factory = new Configuration().configure().buildSessionFactory();  
    Session session = factory.openSession();  
    Transaction t = session.beginTransaction(); 
   // Scanner obj=new Scanner(System.in);
    Employee e1=new Employee();
   // e1.setId(obj.nextInt());
    e1.setId(106);
    e1.setFirstName("praveen6");
    e1.setLastName("kumar6");
    session.save(e1);
    t.commit();
    System.out.println("successfully saved");
    factory.close();
    session.close();
	}

}
