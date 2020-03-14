
import java.util.function.*;
public class BiFunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BiFunction<Integer,Integer,Integer> add=(a,b)->(a+b);
BiFunction<Integer,Integer,Integer> sub=(a,b)->(a-b);
BiFunction<Integer,Integer,Integer> mul=(a,b)->(a*b);
System.out.println(add.apply(4,5));
System.out.println(sub.apply(4,5));
System.out.println(mul.apply(4,5));
	}

}
