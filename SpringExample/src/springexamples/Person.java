package springexamples;

public class Person {
	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void showDetails() {
		System.out.println("my name is "+name+" and age is"+age);
	}
	public void Initial() {
		System.out.println("Initialization");
	}
	public void Ending() {
		System.out.println("Deavtivation of bean");
	}
}
