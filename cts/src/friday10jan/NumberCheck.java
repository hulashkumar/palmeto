package friday10jan;
import java.util.Scanner;
public class NumberCheck {

	public NumberCheck() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		int n;
		Scanner obj=new Scanner(System.in);
		TestNumber obj1=new TestNumber();
		System.out.println("Enter the string");
		s=obj.nextLine();
		try {
			obj1.testString(s);
		}
		catch( NumberFormatException e) {
			System.out.println(e);
		}
		
	}

}
