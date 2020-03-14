package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> h1=new HashMap<Integer,String>();
		ArrayList<String> a1=new ArrayList<String>();
		h1.put(1001,"Hulash");
		h1.put(1002,"kumaR");
		h1.put(1003,"RahuL");
		h1.put(1004,"reddY");
		h1.put(1005,"praveeN");
		Set entries=h1.entrySet();	
		Iterator itr=entries.iterator();
		while(itr.hasNext()) {
			Map.Entry m1=(Map.Entry)itr.next();
			String s=(String)m1.getValue();
			if(s.charAt(0)>=97 && 
					s.charAt(0)<=123 && 
					s.charAt(s.length()-1)>=65 &&
					s.charAt(s.length()-1)<=90 ) {
				a1.add(s);
				}
			}
		System.out.println("The names satisfing");
		for(String i:a1)
			System.out.println(i);
	}

}
