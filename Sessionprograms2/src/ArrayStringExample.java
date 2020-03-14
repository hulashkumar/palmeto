import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ArrayStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String topper=null;
		int total=0,max=0;
		Scanner sc=new Scanner(System.in);
		ArrayList ar=new ArrayList();
		System.out.println("Enter no. of Students");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			ar.add(sc.next());
		}
		System.out.println(ar);
		Iterator itr=ar.iterator();
		while(itr.hasNext()) {
			String temp=(String) itr.next();
			StringTokenizer stk=new StringTokenizer(temp,"-");
			String name=stk.nextToken();
			int a=Integer.parseInt(stk.nextToken());
			int b=Integer.parseInt(stk.nextToken());
			int c=Integer.parseInt(stk.nextToken());
			total=a+b+c;
			if(total>=max) {
				max=total;
				topper=name;
			}	
		}
		System.out.println("maximum marks:"+topper);
		
	}

}
