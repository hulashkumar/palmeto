package assignment23jan;

import java.util.Scanner;

public class Palindrome {
	public static int Vowel(String s) {
		int count=0;
		int temp=0;
		for(int i=0;i<s.length();i++)
			for(int j=0;j<s.length();j++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='o'||s.charAt(i)=='i'||s.charAt(i)=='u') {
				if(s.charAt(j)=='a'||s.charAt(j)=='e'||s.charAt(j)=='o'||s.charAt(j)=='i'||s.charAt(j)=='u'&&s.charAt(i)!=s.charAt(j)) {
					temp=1;
				}
				}}
			
			return temp;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
 String str=sc.nextLine();
 String rev="";
 int n=str.length();
 for(int i=0;i<=n-1;i++) {
	 rev=rev+str.charAt(i);
 }
	 if(str.equalsIgnoreCase(rev) && Vowel(str)==1) {
		 System.out.println("Palindrome");
 }
	 else
		 System.out.println("not palindrome");
	 }
	}


