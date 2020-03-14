import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Associate as=new Associate();
		System.out.println("Enter the associate id:");
		int n=sc.nextInt();
		System.out.println("Enter the associate name:");
		String s=sc.next();
		System.out.println("Enter the number of days:");
		int m=sc.nextInt();
		as.setAssociateId(n);
		as.setAssociateName(s);
		as.setWorkStatus(m);
		Associate.trackAssociateStatus(m, s);
	}

}
