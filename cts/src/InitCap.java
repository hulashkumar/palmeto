import java.util.Scanner;
import java.util.StringTokenizer;

public class InitCap {

	public static void main(String[] args) {
		int count=0;
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringTokenizer str=new StringTokenizer(s," ");
		StringBuffer sb= new StringBuffer();
		//int n=str.countTokens();
		/*while(str.hasMoreElements()) {
			String s2=str.nextToken();
			char c = s2.charAt(0);
			if(((int)c>=65) &&(((int)c<=90))) {
			count++;
			}
		}
		if(count==n) {
			System.out.println("First character of each word is already in uppercase");
		}else {*/
		
		while(str.hasMoreElements()) {
			String s1=str.nextToken();
			sb.append(s1.substring(0,1).toUpperCase()).append(s1.substring(1,s1.length())).append(" ");
			
		}
		String s4=sb.toString();
		System.out.println(s4);
		System.out.println(s);
		/*if(s.equals(s4)) {
			System.out.println("First character of each word is already in uppercase");}
		else {
		System.out.println(sb);}*/
		//System.out.println(sb.toString());
		//System.out.println(s4);
	}

}