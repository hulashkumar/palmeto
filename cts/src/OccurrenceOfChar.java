import java.util.Scanner;
public class OccurrenceOfChar{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("Enter a word:");
        String s=sc.next();
        System.out.println("Enter the character:");
        String s1=sc.next();
        char c=s1.charAt(0);
        //char c=sc.next()
        int l=s.length();
        String a[]=new String[l];
        for(int i=0;i<l;i++){
        	if (s.charAt(i) == c) 
               count++;}
        
        System.out.println(count);
    }
}