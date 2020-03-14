package hibernatepkg;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class ListData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure("hibernate.xml").buildSessionFactory();  
	    Session session = factory.openSession();  
	    Transaction t = session.beginTransaction();
	    //String hql="FROM Employee";
	    //String hql="FROM Employee as E where E.id>=110";
	    String hql="SELECT E.firstName from Employee as E where E.id>=102";
	    Query query=session.createQuery(hql);
	    List<String> items=query.list();
	    for(String s:items) {
	    	System.out.println(s);
	   // List<Employee> items=query.list();
	    //for(Employee e:items) {
	    	//System.out.println(e.getId()+" "+e.getFirstName()+" "+e.getLastName());
	    }
	}

}