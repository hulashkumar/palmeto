package Collection;
import java.util.*;
public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ar=new ArrayList();
		int[] a= {10,89,36};
		ar.add("java");
		ar.add(".Net");
		ar.add("Selenium");
		ar.add("Oracle");
		ar.add(null);
		ar.add(10);
		ar.add(true);
		ArrayList ar1=new ArrayList();
		ar1.add("Science");
		ar1.add("Science1");
		ar1.add("Science2");
		//ar.add(ar1);
		ar.addAll(ar1);
		System.out.println(ar);
		System.out.println(ar1);
	}

}
