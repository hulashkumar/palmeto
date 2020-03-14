package assignment23jan;

import java.util.Scanner;

public class SquareSumEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int rem,sum=0;
			while(n!=0) {
				rem=n%10;
				if(rem%2==0)
					sum=sum+rem*rem;
				n=n/10;
			}
			System.out.println(sum);
	}

}
