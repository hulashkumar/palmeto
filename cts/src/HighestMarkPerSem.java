import java.util.Scanner;
public class HighestMarkPerSem{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter no of semester:");
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
        	int n1=i+1;
            System.out.println("Enter no of subjects in "+n1+" semester:");
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
        	int n2=i+1;
            System.out.println("Marks obtained in semester :"+n2+":");
            
        }
        
        
    }
}