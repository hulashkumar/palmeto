import java.util.function.Consumer;
public class ConsumerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Consumer<String> c=s->System.out.println(s);
c.accept("Hello");
c.accept("Hulash");
Consumer<Integer> p=x->{
	if(x>=20)
		System.out.println("Greater than 20");
	else
		System.out.println("less ");
};
p.accept(30);
	}

}
