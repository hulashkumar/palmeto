package Collection;

import java.util.ArrayList;
import java.util.Collections;
public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1=new ArrayList();
		a1.add("Java");
		a1.add("DotNet");
		a1.add("Selenium");
		System.out.println(a1);
		Collections.sort(a1);
		System.out.println(a1);
		Collections.reverse(a1);
		System.out.println(a1);
		ArrayList arnew=new ArrayList();
		//Collections.copy(arnew,a1);
		//System.out.println(arnew);
		
	}

}
