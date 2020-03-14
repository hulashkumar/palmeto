import java.util.Scanner;
import java.util.StringTokenizer;

public class seperatedBy$ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1;
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringBuffer sb= new StringBuffer();
		StringTokenizer stk=new StringTokenizer(s," "); 
		while(stk.hasMoreTokens())
		{
			s1=stk.nextToken();
			System.out.println(s1);
			String s2=s1.substring(s1.length()-1);
			String s3=s2.toUpperCase();
			sb.append(s3).append("$");
		}
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb.toString());
	}

}
