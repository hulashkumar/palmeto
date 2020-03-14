package assignment23jan;

import java.util.Scanner;

public class ninth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String str=s.nextLine();
int n=Integer.parseInt(str);
int rem,sum=0;
while(n!=0) {
	rem=n%10;
	if(rem%10!=0)
		sum=sum+rem;
	n=n/10;
	}
System.out.println(sum);
	}
}
