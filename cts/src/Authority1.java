import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Authority1{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        StringBuffer sb=new StringBuffer();
        System.out.println("Inmate's name:");
        String s1=sc.nextLine();
        System.out.println("Inmate's father's name:");
        String s2=sc.nextLine();
        boolean flag1=false,flag2=false;
        for(int i=0;i<s1.length();i++) {
        	if(((s1.charAt(i)>=48) && (s1.charAt(i)<=57)) || (s1.charAt(i)==32)) {
        		flag1=true;
        	}
        }
        for(int i=0;i<s2.length();i++) {
        	if(((s2.charAt(i)>=48) && (s2.charAt(i)<=57)) || (s2.charAt(i)==32)) {
        		flag2=true;
        	}
        }
        if(flag1==true && flag2==true) {
       System.out.println(s1.concat(" ").concat(s2).toUpperCase());}
        else {
        	System.out.println("Invalid name");
        }
        
    }
}