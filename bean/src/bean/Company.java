package bean;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
class UserMainCode1{
	public static Map increaseSalaries( int n,HashMap<Integer,String> h1,HashMap<Integer,Integer> h2) { 
	HashMap<Integer,Integer> h3=new HashMap<Integer,Integer>();
		Set keys=h1.keySet();
		Iterator itr=keys.iterator();
		while(itr.hasNext()) {
			int id=(int) itr.next();
			String s=h1.get(id);
			if(s.equals("manager")) {
				int newsalary=h2.get(id)+5000;
				h3.put(id, newsalary);
			}
		}
		return h3;
} 
}
public class Company {
	public static void main(String[] args) {
		HashMap<Integer,String> h1=new HashMap<Integer,String>();
		HashMap<Integer,Integer> h2=new HashMap<Integer,Integer>();
		HashMap<Integer,Integer> h3=new HashMap<Integer,Integer>();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			int id=s.nextInt();
			h1.put(id,s.next());
			h2.put(id,s.nextInt());
		}
		 h3=(HashMap<Integer,Integer>)UserMainCode1.increaseSalaries(n, h1, h2);
		System.out.println(h3);
		
	}
}
