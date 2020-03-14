import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class assessment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer,Double> area=r->3.14*r*r;
		System.out.println(area.apply(4));
		BiFunction<Integer,Integer,Integer>big=(a,b)->{
			if(a>b)
				return a;
			else
				return b;
		};
		System.out.println(big.apply(10,50));
		Predicate<Integer>p1=x->x%2!=0;
		System.out.println(p1.test(20));
		Predicate<Integer> p=x->{if(x%2==0){
		System.out.println("Even");}
	else {
		System.out.println("odd");
		}
	return true;};
	p.test(23);
	}

}
