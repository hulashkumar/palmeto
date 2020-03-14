package friday10jan;
import java.util.function.Predicate;
public class PredicateExample {

	public static void main(String[] args) {
		String[] names= {"Sunny,Karan,Kishore,Khan"};
		Predicate<String> ktest=s->s.charAt(0)=='K';
		for(String n:names) {
			if(ktest.test(n)) {
				//System.out.println(n);
			}
		}
		Predicate<Integer> p=I->(I>=10);
		Predicate<Integer> p1=i->(i%2==0);
		System.out.println(p1.and(p1).test(9));
		//System.out.println();
		Predicate<String> p2=str->(str.length()>=3);
		Predicate<Integer> p3=n->{ 
			boolean flag=true;
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) {
					flag=false;
					break;}
			}
			return flag;
		};
		
		
		//System.out.println(p.test(24));
		//System.out.println(p.test(2));
		//System.out.println(p1.test(11));
		//System.out.println(p1.test(20));
		//System.out.println(p2.test("abc"));
		//System.out.println(p3.test(11));
		
	}

}
