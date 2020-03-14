import java.util.Scanner;
public class Palindrome {
	public static void main(String args[]) {
		String a,b="";
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the string");
		a=obj.nextLine();
		int n=a.length();
		for(int i=n-1;i>=0;i--) {
			b=b+a.charAt(i);
		}
		if(a.equalsIgnoreCase(b)) {
			System.out.println("Palindrome");
		}else 
			System.out.println(" not Palindrome");
	}
}
