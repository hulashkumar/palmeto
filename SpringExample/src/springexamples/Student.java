package springexamples;

public class Student {
		public String getHtno() {
		return htno;
	}
	public void setHtno(String htno) {
		this.htno = htno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void Init() {
		System.out.println("Student inialization");
	}
		String htno;
		String name;
}
