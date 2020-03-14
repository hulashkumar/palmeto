package Collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;

public class ForEachExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList ar=new ArrayList();
Consumer<Integer> consumer=x->{
	if(x%2==0)
		System.out.println("Even");
	else
		System.out.println("Odd");
};
ar.add(10);
ar.add(3);
ar.add(11);
ar.add(8);
ar.add(12);
ar.add(12);
ar.stream().forEach(consumer);
ar.stream().sorted().forEach(System.out::println);
ar.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
long cnt=ar.stream().distinct().count();
System.out.println(cnt);
	}

}
