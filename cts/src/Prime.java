import java.util.Scanner;
public class Prime {
	public void primeCheck(int n) {
		boolean temp=true;
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0) {
				temp=false;
				break;
			}
		}
		if(temp) {
			System.out.println("prime");
		}
		else
			System.out.println("not prime");
	}
	public static void main(String []args) {
		Scanner obj1=new Scanner(System.in);
		Prime obj=new Prime();
		int n=obj1.nextInt();
		obj.primeCheck(n);
	}
	
}
