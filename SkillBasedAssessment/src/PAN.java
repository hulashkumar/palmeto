import java.util.Scanner;

public class PAN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sb=new Scanner(System.in);
		String s=sb.next();
		System.out.println(ValidatePan(s));
	}
	public static boolean ValidatePan(String s) {
		int n=s.length();
		boolean flag=false;
		if(n==10) {
			if(s.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
			flag=true;}
				else {
					flag=false;
			}
			
		}
		return flag;
	}
}

