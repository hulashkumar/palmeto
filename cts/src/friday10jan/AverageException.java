package friday10jan;
import java.util.Scanner;
class InvalidEntryException extends Exception{
	public InvalidEntryException() {
		super("Subject marks can't be negative or more than 100");
	}
}
class AvgMarks{	
public void AvgMarks(int a,int b,int c, String s)  throws  InvalidEntryException{
	int z;
	if(a<=0 || b<=0 || c<=0)
		throw new InvalidEntryException();
	else if(a>=100 || b>=100 ||c>=100)
		throw new InvalidEntryException();
	else
		z=(a+b+c)/3;
	System.out.println(z);
   	}
}
public class AverageException {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		 AvgMarks obj1=new  AvgMarks();
		System.out.println("Enter name of first student");
		String student1=obj.nextLine();
		System.out.println("Enter their marks");
		int a=obj.nextInt();
		int b=obj.nextInt();
		int c=obj.nextInt();
		try {
		obj1.AvgMarks(a,b,c,student1);
		}
		catch(InvalidEntryException e) {
			System.out.println(e);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		 AvgMarks obj2=new  AvgMarks();
			System.out.println("Enter name of first student");
			String student2=obj.nextLine();
			System.out.println("Enter their marks");
			int x=obj.nextInt();
			int y=obj.nextInt();
			int w=obj.nextInt();
			try {
			obj2.AvgMarks(x,y,w,student2);
			}
			catch(InvalidEntryException e) {
				System.out.println(e);
			}
			catch(NumberFormatException e) {
				System.out.println(e);
			}
	}
}
