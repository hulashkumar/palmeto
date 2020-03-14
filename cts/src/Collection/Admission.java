 package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Admission {
	public static void main(String args[]) {
		HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Entry");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter the year");
			int year=sc.nextInt();
			System.out.println("Enter the number of admission");
			int noa=sc.nextInt();
			h.put(year, noa);
		}
			Set entries=h.entrySet();	
			Iterator itr=entries.iterator();
			int max=0;
			int temp=0;
			Integer tyear=0;
			while(itr.hasNext()) {
				Map.Entry entry=(Map.Entry)itr.next();
				temp=(Integer)entry.getValue();
				if(temp>max) {
					max=temp;
					tyear=(Integer)entry.getKey();}
				}
			System.out.println("Maximum admission");
			System.out.println(tyear+","+max);
		}
	}

