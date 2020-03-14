package assignment23jan;

import java.util.Scanner;

public class sixth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		double sum=0,rem;
		int m=str.length();
		int n=Integer.parseInt(str);
		for(int i=m-1;i>0;i--) {
			while(n!=0) {
			rem=n%10;
			n=n/10;
			sum=sum+rem*Math.pow(rem,i);
		}
		}	
		System.out.println(sum);
	}

}
