package unittesting;

import java.util.Scanner;

public class TestApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the permanent address");
		System.out.println("Enter the house name");
		String name=sc.nextLine();
		System.out.println("Enter the street");
		String street=sc.nextLine();
		System.out.println("Enter the city");
		String city=sc.nextLine();
		System.out.println("Enter the state");
		String state=sc.nextLine();
		System.out.println("Enter the temporary address\r\n" + 
				"\r\n" + 
				"Enter the house name");
		System.out.println("Enter the house name");
		String tname=sc.nextLine();
		System.out.println("Enter the street");
		String tstreet=sc.nextLine();
		System.out.println("Enter the city");
		String tcity=sc.nextLine();
		System.out.println("Enter the state");
		String tstate=sc.nextLine();
		AddressBook ab=new AddressBook();
		//Address a=new Address();
		ab.setPermAddress();
		
	}

}
