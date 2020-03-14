import java.util.Scanner;
public class removeDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number of String");
		int n=obj.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++) {
			 a[i]=obj.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(a[i]!=a[j])
				{b[i]=a[i];}	
			}
		}
		int x=b.length;
		int sum=0;
		for(int i=0;i<x;i++) {
			if(b[i]%2==0) 
				sum+=b[i];
			}
		System.out.println(sum);
		
	}

}
