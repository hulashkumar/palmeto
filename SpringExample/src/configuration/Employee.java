package configuration;

public class Employee {
public String getName() {
		return name;
	}

	public Employee(String name, String department) {
	super();
	this.name = name;
	this.department = department;
}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

String name,department;
public void show() {
	System.out.println("name:"+name+" "+"department:"+department);
}

}
