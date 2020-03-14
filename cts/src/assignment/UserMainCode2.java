package assignment;
import java.util.Scanner;
public class UserMainCode2 {
	public static int validateNumber(String str) {
		int b=0;
		if(str.matches("[0-9]{3}[-]{1}[0-9]{3}[-]{1}[0-9]{4}")) {
			b=1;}
		else
			b=-1;{
		return b;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		String str=obj.nextLine();
		UserMainCode2 obj1=new  UserMainCode2();
		obj1.validateNumber(str);
		System.out.println(obj1.validateNumber(str));
	}

}
