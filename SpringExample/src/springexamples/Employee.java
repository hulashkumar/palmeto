package springexamples;

public class Employee {
		public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	public void Init() {
		System.out.println("Intialatazation of Employee");
	}
	public void display()
	{
		System.out.println("name is "+name+"dept is ="+dept);
	}

		String name,dept;
}
