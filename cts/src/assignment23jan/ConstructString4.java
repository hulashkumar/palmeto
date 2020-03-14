package assignment23jan;

import java.util.Scanner;

public class ConstructString4 {
public static void Extract1(String s,int n) {
	int m=s.length();
	if(m%2==0) {
	String a=s.substring(0,(n/2)+1);
	String b=s.substring((m/2)+1,m);
	System.out.println(a+b);}
	else {
		String c=s.substring(0,(n/2)+2);
		String d=s.substring((m/2)+1,m);
		System.out.println(c+d);}
		
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int n=s.nextInt();
		Extract1(str,n);
	}

}
