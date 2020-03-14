package jstlexample;

import java.util.Scanner;

public class KasperNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the n value");
			int n=s.nextInt();
			if(n==1)
				System.out.println("Kasper number");
			else {
			
			int sqr=n*n;
			//int len=String.valueOf(sqr).length();
			String s1=Integer.toString(sqr);
			int len=s1.length();
			//StringBuffer sb=new StringBuffer();
			int n1=Integer.parseInt(s1.substring(0,len/2));
			int n2=Integer.parseInt(s1.substring(len/2,len));
			int sum=n1+n2;
			if(n==sum) {
				System.out.println("Kasper number");
			}
			else {
				System.out.println("not kasper number");
			}
				
			}
			
	}

}
