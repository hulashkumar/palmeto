import java.util.Scanner;
public class Customer{
    public static void main(String[] args){
        String s,gender,city;
        int age;
        Scanner sb=new Scanner(System.in);
        System.out.print("Enter your name:");
            s=sb.next();
        System.out.print("Enter age:");
            age=sb.nextInt();
        System.out.print("Enter gender:");
            gender=sb.next();
        System.out.print("Hailing from:");
            city=sb.next();
        System.out.println("Welcome,"+s);
        System.out.println("Age:"+age);
        System.out.println("Gender:"+gender);
        System.out.println("City:"+city);
        
    }
}