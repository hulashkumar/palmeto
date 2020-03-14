package bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap h=new TreeMap();
		//Scanner s=new Scanner(System.in)
		h.put(1,98);
		h.put(2,86);
		h.put(3,76);
		h.put(4,75);
		h.put(5,47);
		ArrayList<Integer>a1=new ArrayList<Integer>();
		int m=0;
		Set keys=h.keySet();
		Iterator itr=keys.iterator();
		while(itr.hasNext()) {
			int x=(int) itr.next();
			a1.add((Integer) h.get(x));
		}
		//System.out.println(a1);
		Collections.sort(a1);
		//System.out.println(a1);
		m=a1.get(0)+a1.get(1)+a1.get(2);
		System.out.println(m);
	}

}
