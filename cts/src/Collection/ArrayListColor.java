package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListColor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a=new ArrayList<String>();
		ArrayList<String> c=new ArrayList<String>();
		a.add("Blue");
		a.add("Red");
		a.add("Yellow");
		a.add("Orange");
		c.add("Apple");
		c.add("Grapes");
		c.add("Mango");
		System.out.println(a);
		/*Iterator itr=a.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());*/
		a.add(0,"Green");
		System.out.println(a);
		System.out.println(a.get(2));
		a.set(2,"voilet");
		System.out.println(a);
		a.remove(2);
		System.out.println(a);
		boolean ans=a.contains("Blue");
				if(ans)
					System.out.println("contained ");
				else
					System.out.println("not contained");
		Collections.sort(a);
		System.out.println(a);
		System.out.println(a.contains("Blue"));
		System.out.println(a);
		List<String>b=a.subList(0,2);
		System.out.println(b);
		//a.retainAll(b);
		//System.out.println(a);
		a.addAll(c);
		System.out.println(a);
	}

}
