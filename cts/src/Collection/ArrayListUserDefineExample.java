package Collection;
import java.util.*;
import java.util.Collections;
class Student implements Comparable<Student>{
	String htno;
	String name;
	//private String eid;
	Student(String htno,String name){
		this.htno=htno;
		this.name=name;
	}
	public String toString() {
		return "htno=" + htno +",name="+ name;	}
	public int compareTo(Student student) {
		if(name.compareTo(student.name)<0)
			return -1;
		else if(name.compareTo(student.name)>0)
			return -1;
		else
			return 0;
	}
	
}
class Employee{
	@Override
	public String toString() {
		return "Employee [emid=" + emid + ", name=" + name + "]";
	}
	String emid;
	String name;
	public Employee(String emid, String name) {
		super();
		this.emid = emid;
		this.name = name;
	}
}

public class ArrayListUserDefineExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("123","hulash");
		Student s2=new Student("124","Kumar");
		Student s3=new Student("120","harsh");
		ArrayList<Student> a1=new ArrayList<Student>();
		ArrayList<Employee> a2=new ArrayList<Employee>();
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		System.out.println(a1);
		Iterator itr=a1.iterator();
		while(itr.hasNext())
		System.out.println(itr.next());
		for(Student s:a1)
			System.out.println(s.htno+" "+s.name);
		a1.forEach(System.out::println);
		Employee e1=new Employee("001","Kishore");
		Employee e2=new Employee("001","Kishore");
		a2.add(e1);
		a2.add(e2);
		Collections.sort(a1);
		System.out.println(a1);
	}

}