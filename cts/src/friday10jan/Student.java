package friday10jan;
import java.util.ArrayList;
import java.util.function.Function;
public class Student {
	
	String name;
	int marks;
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1=new Student("Ajay",82);
		Student st2=new Student("vijay",93);
		Student st3=new Student("Suraj",78);
		Student st4=new Student("Raju",68);
		Student st5=new Student("kajal",57);
	
	Function<Student,String>f1=st->{
		if(st.marks>=90)
			System.out.println("passed with O grade");
		else if(st.marks>=80 && st.marks<=89)
			System.out.println("passed with E grade");
		else if(st.marks>=70 && st.marks<=79)
			System.out.println("passed with A grade");
		else if(st.marks>=60 && st.marks<=69)
			System.out.println("passed with B grade");
		else if(st.marks>=50 && st.marks<=59)
			System.out.println("passed with C grade");
		else if(st.marks>=40 && st.marks<=49)
			System.out.println("passed with E grade");
		else
			System.out.println("passed with F grade");
		return st.name;
		};
		ArrayList list=new ArrayList<Student>();
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
		list.add(st5);
		Display(f1,list);
}
public static void Display(Function<Student,String> f,ArrayList<Student> list) {
	for(Student e:list) {
		if(f.apply(e)!= null) {
			System.out.println(e);
}
}
}
}