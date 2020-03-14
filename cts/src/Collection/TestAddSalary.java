package Collection;

import java.util.ArrayList;
import java.util.function.BiConsumer;

class TempEmp{
	public TempEmp(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	String name;
	double salary;
}
public class TestAddSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<TempEmp> l=new ArrayList<TempEmp>();
l.add(new TempEmp("Durga",1000));
l.add(new TempEmp("Hulash",2000));
l.add(new TempEmp("Kumar",1000));
BiConsumer<TempEmp,Double>c=(e,d)->e.salary=e.salary+d;
for(TempEmp e:l) {
	c.accept(e, 500.0);
}
for(TempEmp e:l) {
	System.out.println(e.name);
	System.out.println(e.salary);
}
	}

}