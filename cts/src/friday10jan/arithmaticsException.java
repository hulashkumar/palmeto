package friday10jan;
import java.util.Scanner;
public class arithmaticsException extends Exception{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the numbers");
	try {
		int a=obj.nextInt();
		int b=obj.nextInt();
		int c=a/b;
		System.out.println(c);
	}
	catch(ArithmeticException e) {
		System.out.println(e);
		
	}
	}

}
