package Collection;
import java.util.*;
import java.util.ListIterator;
public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar=new ArrayList();
		ar.add("java");
		ar.add("Selenium");
		ar.add("Dotnet");
		System.out.println(ar);
		Iterator itr=ar.iterator();
		while(itr.hasNext())
		System.out.println(itr.next());
		Iterator Ltr=ar.iterator();
	
	}

}
