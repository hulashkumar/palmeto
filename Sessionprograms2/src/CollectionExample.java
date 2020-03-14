import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
class Student1 implements Comparable<Student1>
{
String name;
String age;
String city;
public Student1(String name, String age, String city) {
super();
this.name = name;
this.age = age;
this.city = city;
}
@Override
public String toString() {
return "Student [name=" + name + ", age=" + age + ", city=" + city + "]";
}
@Override
public int compareTo(Student1 s) {
// TODO Auto-generated method stub
if(age.compareTo(s.age)<0)
return 1;
else if(age.compareTo(s.age)>0)
return -1;
else
return 0;
}

}
public class CollectionExample {
public static void main(String args[])
{
Student1 s1=new Student1("hulash","22","gaya");
Student1 s2=new Student1("kumar","25","hyd");
Student1 s3=new Student1("praveen","28","hyd");
TreeSet<Student1> t=new TreeSet<Student1>();
t.add(s1);
t.add(s2);
t.add(s3);
for(Student1 str:t) {
	System.out.println(str);
}
}
}
