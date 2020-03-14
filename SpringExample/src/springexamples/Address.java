package springexamples;

public class Address {
	@Override
	public String toString() {
		return "Address [dno=" + dno + ", city=" + city + ", street=" + street + "]";
	}

	public Address(String dno, String city, String street) {
		super();
		this.dno = dno;
		this.city = city;
		this.street = street;
	}

	String dno,city,street;
}
