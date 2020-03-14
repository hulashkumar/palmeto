package Collection;

import java.util.HashSet;
import java.util.TreeSet;
class Employee1 implements Comparable<Employee1>{
	@Override
	public String toString() {
		return "Employee1 [name=" + name + ", emid=" + emid + "]";
	}
	public Employee1(String name, String emid) {
		super();
		this.name = name;
		this.emid = emid;
	}
	String name;
	String emid;
	public int compareTo(Employee1 emp) {
		if(name.compareTo(emp.name)<0)
			return -1;
		else if(name.compareTo(emp.name)>0)
			return 1;
		else
			return 0;
	}
}
public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet hs=new TreeSet();
		hs.add("India");
		hs.add("China");
		hs.add("Japan");
		hs.add("Sweden");
		hs.add("India");
		System.out.println(hs);
		TreeSet hs1=new TreeSet();
		hs1.add(new Employee1("Name","0003"));
		hs1.add(new Employee1("Kumar","0002"));
		hs1.add(new Employee1("Hulash","0001"));
		hs1.forEach(System.out::println);
	}

}