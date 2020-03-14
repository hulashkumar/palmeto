package bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Exam {
	public static  int Sum(HashMap<Integer,Integer>h) {
		ArrayList<Integer>a1=new ArrayList<Integer>();
		int m=0;
		Set keys=h.keySet();
		Iterator itr=keys.iterator();
		while(itr.hasNext()) {
			int x=(int) itr.next();
			a1.add(h.get(x));
		}
		Collections.sort(a1);
		m=a1.get(0)+a1.get(1)+a1.get(2);
		return m;
	}
	public static void main(String []args) {
		HashMap h=new HashMap();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0; i<n;i++) {
			h.put(s.nextInt(),s.nextInt());
		}
		System.out.println(Sum(h));
		
			
		
		
	}
}
