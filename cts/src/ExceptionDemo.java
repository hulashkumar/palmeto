import java.util.Scanner;
public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int e,f,h;
		Scanner cin=new Scanner(System.in);
		System.out.println("Enter e,f");
		e=cin.nextInt();
		f=cin.nextInt();
		try {
			h=e/f;
			System.out.println("The quotient is"+h);
		}
		catch(java.lang.ArithmeticException obj) {
			System.out.println("The Error is:"+obj);
		}
		System.out.println("Hello java");
		System.out.println("Exception Handling");
	}

}
