package settersExamples;

public class Person {
	

	String id,name;
	Address1 address;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address1 getAddress() {
		return address;
	}
	public void setAddress(Address1 address) {
		this.address = address;
	}
	public void showDetails() {
		System.out.println(id +"  "+name);
		System.out.println(address.dno+"  "+address.street+"  "+address.city);
	}

	
}
