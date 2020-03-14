package springexamples;

public class Person1 {
	public Person1(String name, String city, Address address) {
		super();
		this.name = name;
		this.city = city;
		this.address = address;
	}
	String name;
	String city;
	Address address;
	public void show() {
		System.out.println(name+" "+city);
		System.out.println(address);
	}
}
