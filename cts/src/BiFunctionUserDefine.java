import java.util.function.BiFunction;
import java.util.function.Bi;
class Student2{
	@Override
	public String toString() {
		return "Student2 [htno=" + htno + ", name=" + name + "]";
	}
	public Student2(String htno, String name) {
		super();
		this.htno = htno;
		this.name = name;
	}
	String htno;
	String name;
}
public class BiFunctionUserDefine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<String,String,Student2> bi=(htno,name)->new Student2(htno,name);
		
		Student2 s1=bi.apply("009", "Hulash");
		Student2 s2=bi.apply("008", "Kumar");
		System.out.println(s1);
		System.out.println(s2);
		BiConsumer<String String> c1=(a,b)->
		System.out.println(a+b);
	}

}
