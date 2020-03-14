
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class Student1 {
String name;
int marks;

public Student1(String name, int marks) {
super();
this.marks=marks;
this.name=name;
}

@Override
public String toString() {
return "[Name=" + name + ", Marks=" + marks+ "]" ;
}

public static void main(String[] args) {
// TODO Auto-generated method stub
Student1 s1 = new Student1("Hulash",90);
Student1 s2 = new Student1("kumar",89);
Student1 s3 = new Student1("Praveen",70);
Student1 s4 = new Student1("Boss",39);
Student1 s5 = new Student1("Rahul",60);
Student1 s6 = new Student1("Ranjan",55);
ArrayList <Student1> ar = new ArrayList();
ar.add(s1);
ar.add(s2);
ar.add(s3);
ar.add(s4);
ar.add(s4);
ar.add(s6);
for(Student1 s:ar) {
Predicate <Student1> p = x->(s.marks)<50;
Function <Student1,String> f = z->{String sr ="";
if(s.marks>=80) {
sr="Congratulations you passed with Distinction";}
else if(s.marks>=60&&s.marks<=79) {
sr="First Class";
}
else if(s.marks>=50&&s.marks<=59) {
sr="Second Class";
}
return sr;};


if(p.test(s)==false) {
System.out.println(s+ "  "+f.apply(s));
}

}
}


}
