import java.util.Scanner;
public class Fibo {
	public static int fib(int n) {
		if((n==0)|| (n==1))
			return n;
		else
			return (fib(n-1)+fib(n-2));
	}
	public static void main(String []args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=obj.nextInt();
		for(int i=0;i<n;i++)
		System.out.println(fib(i));
	}
	

}
