package bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Exam1 {
	public static  int Sum(TreeMap<Integer,Integer>h) {
		int m=0;
		Set keys=h.keySet();
		Iterator itr=keys.iterator();
		while(itr.hasNext()) {
			int x=(int) itr.next();
		}
		
		m=h.get(0)+h.get(1)+h.get(2);
		//m=a1.get(0)+a1.get(1)+a1.get(2);
		return m;
	}
	public static void main(String []args) {
		TreeMap h=new TreeMap();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0; i<n;i++) {
			h.put(s.nextInt(),s.nextInt());
		}
		System.out.println(Sum(h));
		
			
		
		
	}
}
