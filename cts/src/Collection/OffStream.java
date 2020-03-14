package Collection;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class OffStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stream s=Stream.of(1,2,3,4,5,6,7,8,9);
Predicate<Integer> predicate=x->x%2==0;
s.filter(predicate).forEach(System.out::println);
long cnt=s.filter(predicate).count();
System.out.println(cnt);
	}

}
