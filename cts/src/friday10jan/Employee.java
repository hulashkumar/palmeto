package friday10jan;

import java.util.function.Predicate;
import java.util.ArrayList;
public class Employee {
	public Employee(String name, String city, int salary, String designation) {
		super();
		Name = name;
		City = city;
		this.salary = salary;
		Designation = designation;
	}
	String Name;
	String City;
	int salary;
	String Designation;
	@Override
	public String toString() {
		return "[Name=" + Name + ", City=" + City + ", salary=" + salary + ", Designation=" + Designation
				+ "]";
	}
	/*public boolean equals(Object obj) {
		Employee e=(Employee)obj;
		if(Name.equals(e.Name))
			return true;
		else
			return false;
	}*/
	public static void main(String []args) {
		Employee emp1=new Employee("Durga","Ceo",30000,"Hydrabad");
		Employee emp2=new Employee("Sunil","Manager",20000,"Hydrabad");
		Employee emp3=new Employee("Karma","Developer",30000,"Hydrabad");
		Employee emp4=new Employee("Durga","Ceo",70000,"Hydrabad");
		Employee emp5=new Employee("Durga","Ceo",60000,"Hydrabad");
	Predicate<Employee>p1=emp->emp.Designation.equals("Manager");
	Predicate<Employee>p2=emp->emp.City.equals("Hydrabad");
	Predicate<Employee>p3=emp->emp.salary<20000;
	System.out.println(emp1);
	ArrayList<Employee>list=new ArrayList<Employee>();
	list.add(emp1);
	list.add(emp2);
	list.add(emp3);
	list.add(emp4);
	list.add(emp5);
	display(p1                   .and(p3),list);
	}
	public static void display(Predicate<Employee>p,ArrayList<Employee>list)
	{
		for(Employee e:list) {
			if(p.test(e)) {
				System.out.println(e);
			}
		}
	}
	
}
