package inheritance;

public class Employee {
		@Override
	public String toString() {
		return "company="+company + ", empId=" + empId + ", name=" + name;
	}

		public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

		String company,empId,name;
}
