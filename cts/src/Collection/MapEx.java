package Collection;
import java.util.*;
public class MapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm=new HashMap();
		Object rest=hm.put("k1","India");
		hm.put("k2","Japan");
		hm.put("k3","Sweden");
		hm.put("k4","China");
		hm.put("k5","India");
		Object obj=hm.putIfAbsent("k1","Canada");
		//System.out.println(rest);
		System.out.println(obj);
		System.out.println(hm);
		Object r=hm.remove("k2");
		System.out.println(hm);
		Set keys=hm.keySet();
		System.out.println(keys);
		Iterator itr=keys.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		Set entries=hm.entrySet();
		Iterator itr1=entries.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());}
	}

}
