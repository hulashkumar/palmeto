package Collection;

import java.util.Stack;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		v.addElement("India");
		v.addElement("China");
		v.addElement("Japan");
		System.out.println(v);
		v.insertElementAt("America",2);
		System.out.println(v);
		v.remove(2);
		System.out.println(v);
		v.removeElementAt(2);
		System.out.println(v);
		Stack s=new Stack();
		s.push("Java");
		s.push("DotNet");
		s.push("Selenium");
		System.out.println(s);
		String temp=(String) s.pop();
		System.out.println(temp);
		System.out.println(s);
		String temp1=(String) s.peek();
		System.out.println(s);
		
	}

}
