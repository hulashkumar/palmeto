package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Student2{
	
	@Override
	public String toString() {
		return "Student2 [name=" + name + ", m1=" + m1 + ", m2=" + m2 + "]";
	}
	public Student2(String name, int m1, int m2) {
		super();
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
	}
	String name;
	int m1,m2;
	
	
}
public class SetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm=new HashMap();
		Student2 s1=new Student2("Hulash",96,98);
		Student2 s2=new Student2("Kumar",97,44);
		Student2 s3=new Student2("Qwert",90,31);
		Student2 s4=new Student2("Asdfg",92,23);
		Object h1=hm.put("k1",s1);
		Object h2=hm.put("k2",s2);
		Object h3=hm.put("k3",s3);
		Object h4=hm.put("k4",s4);
		Set entries=hm.entrySet();
		Iterator itr1=entries.iterator();
		while(itr1.hasNext()) {
			Map.Entry me=(Map.Entry)itr1.next();
			
			System.out.println(itr1.next());}
	}

}
