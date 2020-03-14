package assignment23jan;

import java.util.Arrays;
import java.util.Scanner;

public class seventh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int b;
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
			}
		Arrays.sort(a);
		b=a[n-1]-a[0];
		System.out.println(b);
	}

}
