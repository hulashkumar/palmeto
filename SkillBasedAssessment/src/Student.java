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
		Student s1=new Student("Hulash",80);
		Student s2=new Student("kumar",90);
		Student s3=new Student("praveen",89);
		Student s4=new Student("gagan",100);
		Student s5=new Student("Swaroop",79);
		
		Function<Student,String>f1=st->{
			if(st.marks>=80)
				System.out.println("Congratulation,you got Distinction");
			else if(st.marks>=60 && st.marks<=79)
				System.out.println("Congratulations,you got first class");
			else if(st.marks>=50 && st.marks<=59)
				System.out.println("Congratulations,you got second class");
			else
				System.out.println("Sorry,You got failed");
			return st.name;
			};
			ArrayList list=new ArrayList<Student>();
			list.add(s1);
			list.add(s2);
			list.add(s3);
			list.add(s4);
			list.add(s5);
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