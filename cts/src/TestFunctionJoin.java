import java.util.function.Function;
public class TestFunctionJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String,String> f1=s->s.toUpperCase();
		Function<String,String> f2=s->s.substring(0,9);
		System.out.println("The result of f1:"+f1.apply("Hulashkumar"));
		System.out.println("The result of f2:"+f2.apply("Hulashkumar"));
		System.out.println("The result of f1.andThen(f2):"+f1.andThen(f2).apply("Hulashkumar"));
		System.out.println("The result of f1.compose(f2):"+f1.compose(f2).apply("Hulashkumar"));
	}

}
