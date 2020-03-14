package springexamples;

public class A {
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	String fullName;
	B b;
	A(){System.out.println("a is created");}
	public B getB() {
		return b;
	}
	public void setB(B b) {
		this.b=b;
	}
	void print() {System.out.println("hello two"+fullName);}
	void display() {
		print();
		b.print();
	}
}
