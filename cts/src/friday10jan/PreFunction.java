package friday10jan;
import java.util.function.Function;
public class PreFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String,Integer>f=s->s.length();
		System.out.println("The length of string india:  "+f.apply("India"));
		Function<Integer,Integer>f2=n->n*n;
		System.out.println("The square of given number:  "+f2.apply(4));
		Function<Integer,Integer>fact=x->{
			int q=1;
			for(int i=2;i<=x;i++)
				q=q*i;
				return q;
			};
			Function<String,Integer>f5=str->{
				int count=0;
				for(int i=0;i<str.length();i++) {
				if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
					count++;}
				return count;
			};
		System.out.println("The number of vowel:  "+f5.apply("hulash"));
		Function<String,Integer>f6=str->{
			int count=0;
			for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				continue;
			}else {
				count++;
				}
			}
			return count;
		};
	System.out.println("no. of character without space:  "+f6.apply("hulash kumar"));
			}
			}


