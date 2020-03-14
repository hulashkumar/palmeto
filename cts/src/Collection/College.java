package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class CGroup{
	public CGroup(String d1, String d2, String d3) {
		super();
		this.d1 = d1;
		this.d2 = d2;
		this.d3 = d3;
	}

	String d1,d2,d3;
}
public class College {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,CGroup> m=new HashMap<String,CGroup>();
		m.put("nsec", new CGroup("It","cse","civil"));
		m.put("mit", new CGroup("mech","electrical","civil"));
		m.put("uem", new CGroup("It","mechanical","electronic"));
		m.put("iem", new CGroup("It","cse","ece"));
		Scanner obj=new Scanner(System.in);
		String s=obj.next();
		System.out.println("these colleges offering the above course");
		Set entries=m.entrySet();	
		Iterator itr=entries.iterator();
		//System.out.println("name of department after matching");
		while(itr.hasNext()) {
			Map.Entry m1=(Map.Entry)itr.next();
			CGroup i=(CGroup)m1.getValue();
			if(i.d1.equals(s) || i.d2.equals(s)||i.d2.equals(s)) {
				System.out.println(m1.getKey());
			}
		}
	}

}
