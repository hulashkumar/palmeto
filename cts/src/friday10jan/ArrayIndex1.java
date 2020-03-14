package friday10jan;
import java.util.Scanner;
public class ArrayIndex1 extends Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		try {
		int A[]=new int[n];
		for(int i=0;i<n;i++)
			A[i]=obj.nextInt();
		System.out.println("Enter index number to fetch value");
		int m=obj.nextInt();
		System.out.println("the value of given index is"+A[m]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			
		}
	}

}
