package iostream;

public class Employee {
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", empsalary=" + empsalary + "]";
	}
	public Employee(int empno, String ename, double empsalary) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.empsalary = empsalary;
	}
	private int empno;
	private String ename;
	private double empsalary;
}
