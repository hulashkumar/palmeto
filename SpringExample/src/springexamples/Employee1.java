package springexamples;

public class Employee1 {
		public Employee1(DepartmentBean departmentname) {
		this.departmentname = departmentname;
	}
		public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public DepartmentBean getDepartmentname() {
		return departmentname;
	}
	public void setDepartmentname(DepartmentBean departmentname) {
		this.departmentname = departmentname;
	}
		String fullname;
		DepartmentBean departmentname;
}
