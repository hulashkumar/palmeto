import java.util.ArrayList;
import java.util.Collections;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> a=new ArrayList<Student>();
		Student s1=new Student("Hulash",21,"gaya");
		Student s2=new Student("Kumar",20,"Hyd");
		Student s3=new Student("Praveen",24,"Kol");
		a.add(s1);
		a.add(s2);
		a.add(s3);
		System.out.println(a);
		//Collections.sort(a,Collections.reverseOrder());
	//System.out.println(a);}
		for(Student str:a) {
			System.out.println(str);
		}
	}
}
