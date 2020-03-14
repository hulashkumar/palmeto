package friday10jan;
import java.util.Scanner;

public class A{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		String str = sc.nextLine();
		
		try {
			int x = Integer.parseInt(str);
			System.out.println("The square value is: " + x * x);
			System.out.println("The work has been done successfully");
		} catch (NumberFormatException e) {
			System.out.println(e);
		}

	}

}